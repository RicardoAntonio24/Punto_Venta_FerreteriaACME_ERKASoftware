
create database FERRETERIA_ACME;
use FERRETERIA_ACME;

create table if not exists SUCURSALES (
    ID_SUCURSAL  INT  AUTO_INCREMENT PRIMARY KEY,
    NOMBRE_SUCURSAL  VARCHAR(50)  NOT NULL,
    TELEFONO_SUCURSAL  VARCHAR(10)  NOT NULL,
    CALLE_NUMERO_SUCURSAL  VARCHAR(50)  NOT NULL,
    COLONIA_SUCURSAL  VARCHAR(50)  NOT NULL,
    COD_POSTAL_SUCURSAL  CHAR(5)  NOT NULL,
    CIUDAD_SUCURSAL  VARCHAR(50)  NOT NULL,
    ESTADO_SUCURSAL  VARCHAR(30)  NOT NULL);

create table if not exists PRODUCTOS (
    ID_PRODUCTO  INT  AUTO_INCREMENT PRIMARY KEY,
    NOMBRE_PRODUCTO  VARCHAR(40)  NOT NULL,
    TIPO_PRODUCTO  VARCHAR(20)  NOT NULL,
    MARCA_PRODUCTO  VARCHAR(30)  NOT NULL,
    PRECIO_UNITARIO  FLOAT(8,2)  NOT NULL,
    PRECIO_MAYOREO  FLOAT(8,2)  NOT NULL,
    INICIO_MAYOREO  INT  NOT NULL,
    DESCRIPCION  VARCHAR(100)  NOT NULL);

create table if not exists CLIENTES (
    ID_CLIENTE  INT AUTO_INCREMENT PRIMARY KEY,
    TIPO_CLIENTE  VARCHAR(15)  NOT NULL,
    RFC_CLIENTE  CHAR(13)  NOT NULL,
    NOMBRE_CLIENTE  VARCHAR(50)  NOT NULL,
    APELLIDO_PAT_CLIENTE  VARCHAR(30)  NULL,
    APELLIDO_MAT_CLIENTE  VARCHAR(30)  NULL,
    TELEFONO_CLIENTE  VARCHAR(10)  NOT NULL,
    CORREO_CLIENTE  VARCHAR(40)  NULL,
    CALLE_NUMERO_CLIENTE  VARCHAR(50)  NOT NULL,
    COLONIA_CLIENTE  VARCHAR(50)  NOT NULL,
    COD_POSTAL_CLIENTE  CHAR(5)  NOT NULL,
    CIUDAD_CLIENTE  VARCHAR(50)  NOT NULL,
    ESTADO_CLIENTE  VARCHAR(30)  NOT NULL,
    NOMBRE_REPRESENTANTE  VARCHAR(30)  NULL,
    APELLIDO_PAT_REPRESENTANTE  VARCHAR(30)  NULL,
    APELLIDO_MAT_REPRESENTANTE  VARCHAR(30)  NULL,
    TELEFONO_REPRESENTANTE  VARCHAR(10)  NULL);

create table if not exists PROVEEDORES (
    ID_PROVEEDOR  INT AUTO_INCREMENT PRIMARY KEY,
    RFC_PROVEEDOR  CHAR(13)  NOT NULL,
    NOMBRE_PROVEEDOR  VARCHAR(50)  NOT NULL,
    TELEFONO_PROVEEDOR  VARCHAR(10)  NOT NULL,
    CORREO_PROVEEDOR  VARCHAR(40)  NOT NULL,
    CALLE_NUMERO_PROVEEDOR  VARCHAR(50)  NOT NULL,
    COLONIA_PROVEEDOR  VARCHAR(50)  NOT NULL,
    COD_POSTAL_PROVEEDOR  CHAR(5)  NOT NULL,
    CIUDAD_PROVEEDOR  VARCHAR(50)  NOT NULL,
    ESTADO_PROVEEDOR  VARCHAR(30)  NOT NULL,
    NOMBRE_REPRESENTANTE  VARCHAR(30)  NOT NULL,
    APELLIDO_PAT_REPRESENTANTE  VARCHAR(30)  NOT NULL,
    APELLIDO_MAT_REPRESENTANTE  VARCHAR(30)  NULL,
    TELEFONO_REPRESENTANTE  VARCHAR(10)  NOT NULL);


create table if not exists EMPLEADOS_VENTAS (
    ID_EMPLEADO  INT AUTO_INCREMENT PRIMARY KEY,
    RFC_EMPLEADO  CHAR(13)  NOT NULL,
    NOMBRE_EMPLEADO  VARCHAR(30)  NOT NULL,
    APELLIDO_PAT_EMPLEADO  VARCHAR(30)  NOT NULL,
    APELLIDO_MAT_EMPLEADO  VARCHAR(30)  NULL,
    FECHA_NAC_EMPLEADO  DATE  NOT NULL,
    FECHA_INGRESO_EMPLEADO  DATE  NOT NULL,
    TELEFONO_EMPLEADO  VARCHAR(10)  NOT NULL,
    CALLE_NUMERO_EMPLEADO  VARCHAR(50)  NOT NULL,
    COLONIA_EMPLEADO  VARCHAR(50)  NOT NULL,
    COD_POSTAL_EMPLEADO  CHAR(5)  NOT NULL,
    CIUDAD_EMPLEADO  VARCHAR(50)  NOT NULL,
    ESTADO_EMPLEADO  VARCHAR(30)  NOT NULL,
    CONTRASENA_EMPLEADO  VARCHAR(30)  NOT NULL);

create table if not exists ADMINISTRADORES (
    ID_ADMIN  INT AUTO_INCREMENT PRIMARY KEY,
    RFC_ADMIN  CHAR(13)  NOT NULL,
    NOMBRE_ADMIN  VARCHAR(30)  NOT NULL,
    APELLIDO_PAT_ADMIN  VARCHAR(30)  NOT NULL,
    APELLIDO_MAT_ADMIN  VARCHAR(30)  NULL,
    FECHA_NAC_ADMIN  DATE  NOT NULL,
    FECHA_INGRESO_ADMIN  DATE  NOT NULL,
    TELEFONO_ADMIN  VARCHAR(10)  NOT NULL,
    CORREO_ADMIN  VARCHAR(40)  NOT NULL,
    CALLE_NUMERO_ADMIN  VARCHAR(50)  NOT NULL,
    COLONIA_ADMIN  VARCHAR(50)  NOT NULL,
    COD_POSTAL_ADMIN  CHAR(5)  NOT NULL,
    CIUDAD_ADMIN  VARCHAR(50)  NOT NULL,
    ESTADO_ADMIN  VARCHAR(30)  NOT NULL,
    CONTRASENA_ADMIN  VARCHAR(30)  NOT NULL);


# Tablas con claves foráneas (dependientes)...

create table if not exists VENTAS (
    ID_VENTA  INT  AUTO_INCREMENT PRIMARY KEY,
    FECHA_VENTA  TIMESTAMP  DEFAULT NOW(),
    ID_SUCURSAL  INT  NOT NULL,
    ID_EMPLEADO  INT,
    ID_CLIENTE  INT,
    SUBTOTAL_VENTA  FLOAT(9,2)  NOT NULL,
    IVA_VENTA  FLOAT(9,2)  NOT NULL,
    TOTAL_VENTA  FLOAT(9,2)  NOT NULL,
    ID_DESCUENTO  INT  NOT NULL,
    IMPORTE_FINAL  FLOAT(9,2)  NOT NULL,
    FORMA_PAGO  VARCHAR(20)  NOT NULL,
    ENTIDAD_BANCARIA  VARCHAR(40)  NULL,
    NO_CUENTA  CHAR(16)  NULL,
    foreign key (ID_EMPLEADO) references EMPLEADOS_VENTAS(ID_EMPLEADO),
    foreign key (ID_CLIENTE) references CLIENTES(ID_CLIENTE));

create table if not exists DETALLE_VENTA (
    ID_DETALLE_VENTA  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_VENTA  INT,
    ID_PRODUCTO  INT,
    CANTIDAD  INT  NOT NULL,
    PRECIO_VENTA  FLOAT(8,2)  NOT NULL,
    TOTAL_PRODUCTO  FLOAT(9,2)  NOT NULL,
    ID_PROMOCION  INT  NOT NULL,
    TOTAL_CON_DESCUENTO  FLOAT(9,2)  NOT NULL,
    foreign key (ID_VENTA) references VENTAS(ID_VENTA),
    foreign key (ID_PRODUCTO) references PRODUCTOS(ID_PRODUCTO));


create table if not exists COMPRAS (
    ID_COMPRA  INT  AUTO_INCREMENT PRIMARY KEY,
    FECHA_COMPRA  TIMESTAMP  DEFAULT NOW(),
    ID_SUCURSAL  INT  NOT NULL,
    ID_ADMIN  INT,
    ID_PROVEEDOR  INT,
    SUBTOTAL_COMPRA  FLOAT(9,2)  NOT NULL,
    IVA_COMPRA  FLOAT(9,2)  NOT NULL,
    IMPORTE_TOTAL_COMPRA  FLOAT(9,2)  NOT NULL,
    foreign key (ID_ADMIN) references ADMINISTRADORES(ID_ADMIN),
    foreign key (ID_PROVEEDOR) references PROVEEDORES(ID_PROVEEDOR));

create table if not exists DETALLE_COMPRA (
    ID_DETALLE_COMPRA  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_COMPRA  INT,
    ID_PRODUCTO  INT,
    CANTIDAD  INT  NOT NULL,
    PRECIO_COMPRA  FLOAT(8,2)  NOT NULL,
    TOTAL_PRODUCTO  FLOAT(9,2)  NOT NULL,
    foreign key (ID_COMPRA) references COMPRAS(ID_COMPRA),
    foreign key (ID_PRODUCTO) references PRODUCTOS(ID_PRODUCTO));


create table if not exists PRODUCTOS_POR_SUCURSAL (
    ID_PROD_POR_SUCURSAL  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_PRODUCTO  INT,
    ID_SUCURSAL  INT,
    EXISTENCIA  INT  NOT NULL,
    foreign key (ID_PRODUCTO) references PRODUCTOS(ID_PRODUCTO),
    foreign key (ID_SUCURSAL) references SUCURSALES(ID_SUCURSAL));

create table if not exists PRODUCTOS_DEFECTUOSOS (
    ID_PROD_DEFECTUOSO  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_PRODUCTO  INT,
    CANTIDAD_AFECTADA  INT  NOT NULL,
    DESCRIPCION_DEFECTO  VARCHAR(100)  NOT NULL,
    foreign key (ID_PRODUCTO) references PRODUCTOS(ID_PRODUCTO));

create table if not exists FACTURACION (
    ID_FACTURA  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_VENTA  INT,
    FECHA_FACTURA  DATE  NOT NULL,
    foreign key (ID_VENTA) references VENTAS(ID_VENTA));



create table if not exists DESCUENTOS (
    ID_DESCUENTO  INT  AUTO_INCREMENT PRIMARY KEY,
    MONTO_MINIMO  FLOAT(9,2)  NOT NULL,
    MONTO_LIMITE  FLOAT(9,2)  NOT NULL,
    PORCENTAJE_DESCUENTO  INT  NOT NULL,
    FECHA_INICIO  DATE  NOT NULL,
    FECHA_LIMITE  DATE  NOT NULL);


create table if not exists PROMOCIONES (
    ID_PROMOCION  INT  AUTO_INCREMENT PRIMARY KEY,
    ID_PRODUCTO INT,
    TIPO_PROMOCION  VARCHAR(20)  NOT NULL,
    DESCUENTO_PROMOCION  INT  NULL,
    FECHA_INICIO_PROMO  DATE  NOT NULL,
    FECHA_LIMITE_PROMO  DATE  NOT NULL,
    ID_SUCURSAL  INT  NOT NULL,
    foreign key (ID_PRODUCTO) references PRODUCTOS(ID_PRODUCTO));


# Inserción de datos a las tablas principales (6)...

insert into CLIENTES (ID_CLIENTE,TIPO_CLIENTE,RFC_CLIENTE,NOMBRE_CLIENTE,APELLIDO_PAT_CLIENTE,APELLIDO_MAT_CLIENTE,TELEFONO_CLIENTE,CORREO_CLIENTE,CALLE_NUMERO_CLIENTE,COLONIA_CLIENTE,COD_POSTAL_CLIENTE,CIUDAD_CLIENTE,ESTADO_CLIENTE,NOMBRE_REPRESENTANTE,APELLIDO_PAT_REPRESENTANTE,APELLIDO_MAT_REPRESENTANTE,TELEFONO_REPRESENTANTE) values 
(1,'PERSONA FISICA','FFFFFFFF11111','ROMAN','CASTRO','DURAN','7751245698','roman_cas21@hotmail.com','HORMIGA 102','EL REFUGIO','43600','TULANCINGO','HIDALGO', null, null, null, null),
(2,'PERSONA MORAL','MMMMMMMM11111','CONSTRUCTORA HIDALGO','GOMEZ','HERRERA','7425561','constructora-hgo@outlook.com','CUARENTA 40','DEL VALLE','45620','PACHUCA','HIDALGO','RAUL','GUTIERREZ','PANAL','7714589632'),
(3,'PERSONA MORAL','MMMMMMMM22222','CASAS DEL SOL','DOMINGUEZ','SOSA','7234589','casas.sol11@gmail.com','LA QUINTA 782','ALAMEDA','45210','ATOTONILCO DE TULA','HIDALGO','ALBERTO','QUIROGA','VAZQUEZ','7715428900'),
(4,'PERSONA FISICA','FFFFFFFF22222','JULIO SERGIO','CASTELAN','LEINES','7754263510','jsergio.leines@gamil.com','16 DE SEPTIEMBRE 701','20 DE NOVIEMBRE','43642','TULANCINGO','HIDALGO', null, null, null, null),
(5,'PERSONA FISICA','FFFFFFFF33333','ANGEL','MARTINEZ','CASTELAN','7774521032','sangel_mar@hotmail.com','NUEVA AVENIDA 154','ROMA','41532','HUAUCHINANGO','PUEBLA', null, null, null, null);


insert into PROVEEDORES (ID_PROVEEDOR,RFC_PROVEEDOR,NOMBRE_PROVEEDOR,TELEFONO_PROVEEDOR,CORREO_PROVEEDOR,CALLE_NUMERO_PROVEEDOR,COLONIA_PROVEEDOR,COD_POSTAL_PROVEEDOR,CIUDAD_PROVEEDOR,ESTADO_PROVEEDOR,NOMBRE_REPRESENTANTE,APELLIDO_PAT_REPRESENTANTE,APELLIDO_MAT_REPRESENTANTE,TELEFONO_REPRESENTANTE) values 
(1,'AAAAAAAA11111','CEMEX','5621478','cementos.cemex.mx@hotmail.com','LOPEZ DE SANTAANA 45','LAS LOMAS','21563','CDMX','DISTRITO FEDERAL','CARLOS','MORENO','GARCIA','7701458978'),
(2,'BBBBBBBB22222','DEL VALLE','7125896','fabricas-delvalle@hotmail.com','AVENIDA DEL TRABAJO 123','CUBITOS','40251','PACHUCA','HIDALGO','NORMA','GOMEZ','ORDAZ','7711102563'),
(3,'CCCCCCCC33333','TRUPER','5568910','truper-mx@gmail.com','PROLONGACION VEINTIUNO 21','SAN JACINTO','27451','CDMX','DISTRITO FEDERAL','GONZALO','DOMINGUEZ','MARQUEZ','7502136570'),
(4,'DDDDDDDD44444','PHILLIPS','7612589','phillips-corp@hotmail.com','CIRCUNBALACION 879','20 DE NOVIEMBRE','36521','PUEBLA','PUEBLA','CORINA','TELLEZ','DE LA CRUZ','7624578900'),
(5,'EEEEEEEE55555555','IUSA','6958400','fabricaiusa-mex@gmail.com','AUTOPISTA PUEBLA 114','RIO VIEJO','40258','PUEBLA','PUEBLA','RAMON','ARAIZA','GOMEZ','7425896310');


insert into EMPLEADOS_VENTAS (RFC_EMPLEADO,NOMBRE_EMPLEADO,APELLIDO_PAT_EMPLEADO,APELLIDO_MAT_EMPLEADO,FECHA_NAC_EMPLEADO,FECHA_INGRESO_EMPLEADO,TELEFONO_EMPLEADO,CALLE_NUMERO_EMPLEADO,COLONIA_EMPLEADO,COD_POSTAL_EMPLEADO,CIUDAD_EMPLEADO,ESTADO_EMPLEADO,CONTRASENA_EMPLEADO) values
('EMPVENTAS1111','Alexis','Hernandez','Perez','1997-10-20','2007-10-20','775123450','heroes de nacozari 25','la estacion','43720','tulancingo','Hidalgo','uno'),
('EMPVENTAS1112','Angeles','Gayosso','Octaviano','1999-06-23','2011-05-25','771123450','la morena 104','la morena ','43550','tulancingo','Pachuca','dos'),
('EMPVENTAS1113','Diego','Bolaños','Pardo','1997-12-12','2012-12-20','771432234','morelos pavon 45','tulancingo','72012','tulancingo','Chiapas ','tres'),
('EMPVENTAS1114','Mario','Nieto','Lopez','1999-01-09','2007-01-15','775127051','francico i madero 102','francisco i madero','77234','tulancingo','Guerrero','cuatro'),
('EMPVENTAS1115','Andres','Hernandez','Ramirez','1999-11-02','2015-07-02','775113247','cuautepec 111','la esperanza ','740123','tulancingo','Zacatecas ','cinco');


insert into ADMINISTRADORES (RFC_ADMIN,NOMBRE_ADMIN,APELLIDO_PAT_ADMIN,APELLIDO_MAT_ADMIN,FECHA_NAC_ADMIN,FECHA_INGRESO_ADMIN,TELEFONO_ADMIN,CORREO_ADMIN,CALLE_NUMERO_ADMIN,COLONIA_ADMIN,COD_POSTAL_ADMIN,CIUDAD_ADMIN,ESTADO_ADMIN,CONTRASENA_ADMIN) values
('ADMINISTRAD01','karla ','fragoso','cerecedo','1998-11-04','2017-05-10','7752151742','rojo1@gmail.com','102','Magisterio ','92136','Tulancingo','Hidalgo','rojo1'),
('ADMINISTRAD02','Gloria','Cerecedo','Perez','1967-09-06','2017-11-12','7891186979','rojo2@gmail.com','s/n','Platanal','92101','Tantoyuca','Veracruz','rojo2'),
('ADMINISTRAD03','Agustin','Monter','Vera','1998-08-28','2018-02-10','7751362563','rojo3@gmail.com','s/n','Magisterio ','92136','Tulancingo','Hidalgo','rojo3'),
('ADMINISTRAD04','Ricardo','Cerecedo','Morales','1999-11-15','2015-12-15','7891102665','rojo4@gmail.com','126','Platanal','92105','Tantoyuca','Veracruz','rojo4'),
('ADMINISTRAD05','lucia','morales','hernandez','1968-11-17','2017-03-11','7751360915','rojo5@gmail.com','s/n','Morena','92103','Tulancingo','Hidalgo','rojo5');


insert into PRODUCTOS (NOMBRE_PRODUCTO,TIPO_PRODUCTO,MARCA_PRODUCTO,PRECIO_UNITARIO,PRECIO_MAYOREO,INICIO_MAYOREO,DESCRIPCION) values
('Martillo','herramienta','Toolcraft',58,55,10,'uña curva semipulido 16 OZ'),
('Llave ','herramienta','Black & Decker',14,12,5,'combinada 6 mm'),
('Compresor ','Maquinaria','Hp Premier',2100,2000,6,'portátil de 1/2'),
('Paquete de clavos','herramienta','Fifa',65,63,10,'3/4" calibre 18 '),
('Desarmador ','herramienta','Wolfox',13,10,10,'punta phillips 1/4" x 6" ');


insert into SUCURSALES (NOMBRE_SUCURSAL,TELEFONO_SUCURSAL,CALLE_NUMERO_SUCURSAL,COLONIA_SUCURSAL,COD_POSTAL_SUCURSAL,CIUDAD_SUCURSAL,ESTADO_SUCURSAL) values
('SUCURSAL TULANCINGO CORREDOR','7428950','AVENIDA DEL TRABAJO 526','VICENTE GUERRERO','41568','TULANCINGO','HIDALGO'),
('SUCURSAL TULANCINGO CENTRO','7452896','IGNACIO ALLENDE 210','CENTRO','42568','TULANCINGO','HIDALGO'),
('SUCURSAL CUAUTEPEC','7589601','ALVARO OBREGON 314','CENTRO','40258','CUAUTEPEC','HIDALGO'),
('SUCURSAL SINGUILUCAN','7358920','RINCON DEL SOL 120','CATOLICA','44583','SINGUILUCAN','HIDALGO'),
('SUCURSAL PACHUCA','7158941','BLVD. FELIPE ANGELES 210','VALLE DE SAN JAVIER','40215','PACHUCA','HIDALGO');

