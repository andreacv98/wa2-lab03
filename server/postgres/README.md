#To start a new docker Postgres container:

`docker run -d --name wa2-lab03-pg -p 5432:5432 -e POSTGRES_PASSWORD=pwd -e PGDATA=/var/lib/postgresql/data/pgdata -v <absolute_projectpath\postgres\data>:/var/lib/postgresql/data postgres`

Teo PC:
docker run -d --name wa2-lab03-pg -p 5432:5432 -e POSTGRES_PASSWORD=pwd -e PGDATA=/var/lib/postgresql/data/pgdata -v C:\Users\teodo\Desktop\Projects\wa2-lab03\postgres\data:/var/lib/postgresql/data postgres
