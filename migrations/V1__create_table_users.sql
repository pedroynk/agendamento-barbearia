CREATE TABLE bs_user (
        usr_id bigserial NOT NULL,
        usr_login varchar(255) NOT NULL,
        usr_password varchar(255) NOT NULL,
        PRIMARY KEY (usr_id)
    )