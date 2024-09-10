# API de Gestión de Clientes

Este proyecto es una API de gestión de clientes desarrollada con Spring Boot y Spring Data REST. Proporciona operaciones CRUD básicas y permite filtrar clientes por diferentes criterios.

## Tecnologías Utilizadas

- Spring Boot
- Spring Data JPA
- Spring Data REST

## Configuración del Proyecto

1. Clona el repositorio:
   ```bash
   git clone https://github.com/dvrvk/dvrvk-spring-data-rest.git
   ```
2. Navega al directorio del proyecto:
   ```bash
   cd tu-repositorio
   ```
3. Ejecuta la aplicación:
   ```bash
   ./mvnw spring-boot:run
   ```

## Endpoints Disponibles

### CRUD Básico

- `GET /customers`: Obtiene una lista de todos los clientes.
- `POST /customers`: Crea un nuevo cliente.
- `GET /customers/{id}`: Obtiene un cliente específico por su ID.
- `PUT /customers/{id}`: Actualiza un cliente existente.
- `DELETE /customers/{id}`: Elimina un cliente.

### Búsquedas Personalizadas

- `GET /customers/search/findByEmail?email={email}`: Filtra clientes por email.
- `GET /customers/search/email-starts?email={email}`: Filtra clientes cuyos emails comienzan con un valor específico.
- `GET /customers/search/category-department?category={category}&department={department}`: Filtra clientes por categoría y departamento.
- `GET /customers/search/category-department-in?category={category}&department={department1}&department={department2}`: Filtra clientes por categoría y una lista de departamentos.

## Ejemplos de Uso

### Filtrar por Email

```bash
curl -X GET "http://localhost:8080/customers/search/findByEmail?email=cust1@gmail.com"
```

### Filtrar por Email que Comienza con un Valor

```bash
curl -X GET "http://localhost:8080/customers/search/email-starts?email=cust"
```

### Filtrar por Categoría y Departamento

```bash
curl -X GET "http://localhost:8080/customers/search/category-department?category=cat1&department=dep2"
```

### Filtrar por Categoría y Múltiples Departamentos

```bash
curl -X GET "http://localhost:8080/customers/search/category-department-in?category=cat2&department=dep1&department=dep2"
```
