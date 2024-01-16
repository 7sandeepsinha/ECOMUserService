CREATE TABLE user_authorization
(
    id                            VARCHAR(255) NOT NULL,
    registered_client_id          VARCHAR(255) NULL,
    principal_name                VARCHAR(255) NULL,
    authorization_grant_type      VARCHAR(255) NULL,
    authorized_scopes             TEXT NULL,
    attributes                    TEXT NULL,
    state                         VARCHAR(500) NULL,
    authorization_code_value      TEXT NULL,
    authorization_code_issued_at  timestamp NULL,
    authorization_code_expires_at timestamp NULL,
    authorization_code_metadata   VARCHAR(255) NULL,
    access_token_value            TEXT NULL,
    access_token_issued_at        timestamp NULL,
    access_token_expires_at       timestamp NULL,
    access_token_metadata         TEXT NULL,
    access_token_type             VARCHAR(255) NULL,
    access_token_scopes           TEXT NULL,
    refresh_token_value           TEXT NULL,
    refresh_token_issued_at       timestamp NULL,
    refresh_token_expires_at      timestamp NULL,
    refresh_token_metadata        TEXT NULL,
    oidc_id_token_value           TEXT NULL,
    oidc_id_token_issued_at       timestamp NULL,
    oidc_id_token_expires_at      timestamp NULL,
    oidc_id_token_metadata        TEXT NULL,
    oidc_id_token_claims          TEXT NULL,
    user_code_value               TEXT NULL,
    user_code_issued_at           timestamp NULL,
    user_code_expires_at          timestamp NULL,
    user_code_metadata            TEXT NULL,
    device_code_value             TEXT NULL,
    device_code_issued_at         timestamp NULL,
    device_code_expires_at        timestamp NULL,
    device_code_metadata          TEXT NULL,
    CONSTRAINT pk_authorization PRIMARY KEY (id)
);


CREATE TABLE authorization_consent
(
    registered_client_id VARCHAR(255) NOT NULL,
    principal_name       VARCHAR(255) NOT NULL,
    authorities          VARCHAR(1000) NULL,
    CONSTRAINT pk_authorizationconsent PRIMARY KEY (registered_client_id, principal_name)
);

CREATE TABLE client
(
    id                            VARCHAR(255) NOT NULL,
    client_id                     VARCHAR(255) NULL,
    client_id_issued_at           timestamp NULL,
    client_secret                 VARCHAR(255) NULL,
    client_secret_expires_at      timestamp NULL,
    client_name                   VARCHAR(255) NULL,
    client_authentication_methods VARCHAR(1000) NULL,
    authorization_grant_types     VARCHAR(1000) NULL,
    redirect_uris                 VARCHAR(1000) NULL,
    post_logout_redirect_uris     VARCHAR(1000) NULL,
    scopes                        VARCHAR(1000) NULL,
    client_settings               VARCHAR(2000) NULL,
    token_settings                VARCHAR(2000) NULL,
    CONSTRAINT pk_client PRIMARY KEY (id)
);
