CREATE KEYSPACE blaze WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor' : 2};
CREATE TABLE blaze.resources (hash text PRIMARY KEY, content blob);
CREATE TABLE blaze.clauses ("token" text PRIMARY KEY, content blob);
