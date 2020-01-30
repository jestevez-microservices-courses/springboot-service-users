INSERT INTO users (username, password, enabled, firstname, lastname, email) values ('user_one', '123456', true, 'User', 'One', 'user_one@mail.com');
INSERT INTO users (username, password, enabled, firstname, lastname, email) values ('user_two', '123456', true, 'User', 'Two', 'user_two@mail.com');

INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id)  VALUES (1,1);
INSERT INTO users_roles (user_id, role_id)  VALUES (2,2);
INSERT INTO users_roles (user_id, role_id)  VALUES (2,1);
