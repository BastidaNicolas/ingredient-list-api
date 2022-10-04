# ingredient-list-api
Springboot CRUD api of list of engredients with celiac filtering

# Task

### API para repostería

Una repostera posee una gran cantidad de clientes celíacos, para quienes realiza diferentes viandas semanales. Para poder mejorar su trabajo, necesita del desarrollo de una API que le permita cargar a una lista y consultar en la misma los diferentes ingredientes que no contienen gluten.

### Calls

##### Get all condiments

/condiments

##### Get a condiment by id

/condiments/{id}

##### Get only celiac or non celiac condiments

/condiments/celiac (add a boolean "celiac" to params)

##### Add condiment to list

/condiments/add (add params that are in the condiment model)

##### Edit a condiment

/condiment/edit/{id} (add params that are in the condiment model)

##### Delete a condiment

/condiment/remove/{id}

# Status 

:heavy_check_mark: Completed
