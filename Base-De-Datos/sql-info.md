# Fundamentos de SQL
En este artículo se presentan ejemplos e implementaciones de consultas SQL básicas para la comprensión del funcionamiento del lenguaje. Las consultas suelen ser universales, pero para este caso específico se usa PostgreSQL.

## CRUD
Es el el acrónimo para Create, Read, Update y Delete. Es el tratamiento de datos más primitivo que se trabajará con SQL (y en varios entornos más).

### Create
Crea una nueva tabla en una base de datos existente.
```sql
CREATE TABLE nombre_tabla (
    columna1 tipo_dato1,
    columna2 tipo_dato2,
    ...,
    columnaN tipo_datoN
);
```
Inserta nuevos registros en una tabla existente.
```sql
INSERT INTO nombre_tabla (columna1, columna2, ..., columnaN) 
VALUES (valor1, valor2, ..., valorN);
```

### Read
Recupera registros de una o más tablas.
```sql
SELECT columna1, columna2, ..., columnaN 
FROM nombre_tabla
WHERE condiciones; -- Opcional, para filtrar resultados
```

### Update
Modifica registros existentes en una tabla.
```sql
UPDATE nombre_tabla
SET columna1 = nuevo_valor1, columna2 = nuevo_valor2, ..., columnaN = nuevo_valorN
WHERE condiciones; -- Opcional, para actualizar registros específicos
```

### Delete
Elimina registros de una tabla.
```sql
DELETE FROM nombre_tabla
WHERE condiciones; -- Opcional, para eliminar registros específicos
```

## JOIN
Las tablas en una base de datos se pueden entender como **conjuntos** que pueden tener **elementos**, con esto podemos utilizar algo similar al _algebra de conjuntos_ y así poder manipular los datos entre tablas.

### INNER
También conocido como JOIN, devuelve solamente los registros que tienen coincidencias en ambas tablas.

![image](https://user-images.githubusercontent.com/71245625/255346710-ca0d51db-c944-41ae-9614-9805a7996324.png)

```sql
SELECT columna1, columna2, ...
FROM tabla1
INNER JOIN tabla2
ON tabla1.columna_relacionada = tabla2.columna_relacionada;
```

### LEFT
Devuelve todos los registros de la tabla izquierda (tabla1) y los registros coincidentes de la tabla derecha (tabla2).

![image](https://user-images.githubusercontent.com/71245625/255346717-80b7cdde-e038-496f-a06f-1d9f4c04710c.png)

```sql
SELECT columna1, columna2, ...
FROM tabla1
LEFT JOIN tabla2
ON tabla1.columna_relacionada = tabla2.columna_relacionada;
```

### RIGHT
Es similar al LEFT JOIN, pero devuelve todos los registros de la tabla derecha (tabla2) y los registros coincidentes de la tabla izquierda (tabla1).

![image](https://user-images.githubusercontent.com/71245625/255346734-b4f17467-481d-4f57-9065-7d906687e6ed.png)

```sql
SELECT columna1, columna2, ...
FROM tabla1
RIGHT JOIN tabla2
ON tabla1.columna_relacionada = tabla2.columna_relacionada;
```

### FULL
Devuelve todos los registros cuando hay una coincidencia en cualquiera de las tablas.

![image](https://user-images.githubusercontent.com/71245625/255346747-c5af66aa-0df5-40a8-91da-2f4e75e76452.png)

```sql
SELECT columna1, columna2, ...
FROM tabla1
FULL JOIN tabla2
ON tabla1.columna_relacionada = tabla2.columna_relacionada;
```

## Fechas
### Tiempo actual
```sql
SELECT CURRENT_DATE; -- Solo la fecha
SELECT CURRENT_TIME; -- Solo la hora
SELECT CURRENT_TIMESTAMP; -- Fecha y hora juntas

```

### Partes específicas de una fecha
```sql
SELECT EXTRACT(YEAR FROM fecha_registro) AS anio FROM mi_tabla; -- Opción 1
SELECT DATE_PART('year', fecha_registro) AS anio FROM mi_tabla; -- Opción 2
```

### Filtrar por fechas
```sql
SELECT * FROM mi_tabla WHERE fecha_registro BETWEEN '2023-07-01' AND '2023-07-31';
```
