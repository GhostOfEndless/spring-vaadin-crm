-- user is user and password is password
INSERT INTO security.t_app_user(c_username, c_name, c_hashed_password)
VALUES ('user', 'Aleksey Kabanov', '$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW');

INSERT INTO security.t_app_user_role(app_user_id, c_role) VALUES (1, 'USER');