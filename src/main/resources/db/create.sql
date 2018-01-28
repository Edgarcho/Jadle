SET MODE PostgresSql;

CREATE TABLE IF NOT EXISTS restaurants(
    id int PRIMARY KEY  auto_increments,
    name VARCHAR,
    address VARCHAR,
    zipcode VARCHAR,
    phone VARCHAR,
    website VARCHAR,
    email VARCHAR
);

CREATE TABLE IF NOT EXISTS foodtypes(
    id int PRIMARY KEY auto_increments,
    name VARCHAR
);

CREATE TABLE IF NOT EXISTS reviews(
    id int PRIMARY KEY auto-auto_increments,
    writtenby VARCHAR,
    content VARCHAR,
    rating VARCHAR,
    restaurantid INTEGER
);