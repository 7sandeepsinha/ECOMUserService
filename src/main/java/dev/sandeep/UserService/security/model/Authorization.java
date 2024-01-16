package dev.sandeep.UserService.security.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "`user_authorization`")
@Getter
@Setter
public class Authorization {
    @Id
    @Column
    private String id;
    private String registeredClientId;
    private String principalName;
    private String authorizationGrantType;

    private String authorizedScopes;

    private String attributes;
    @Column(length = 500)
    private String state;


    private String authorizationCodeValue;
    private Instant authorizationCodeIssuedAt;
    private Instant authorizationCodeExpiresAt;
    private String authorizationCodeMetadata;


    private String accessTokenValue;
    private Instant accessTokenIssuedAt;
    @Column(name = "access_token_expires_at")
    private Instant accessTokenExpiresAt;

    private String accessTokenMetadata;
    private String accessTokenType;

    private String accessTokenScopes;

    private String refreshTokenValue;
    private Instant refreshTokenIssuedAt;
    private Instant refreshTokenExpiresAt;

    private String refreshTokenMetadata;


    private String oidcIdTokenValue;
    private Instant oidcIdTokenIssuedAt;
    private Instant oidcIdTokenExpiresAt;
    private String oidcIdTokenMetadata;
    private String oidcIdTokenClaims;

    private String userCodeValue;
    private Instant userCodeIssuedAt;
    private Instant userCodeExpiresAt;
    private String userCodeMetadata;

    private String deviceCodeValue;
    private Instant deviceCodeIssuedAt;
    private Instant deviceCodeExpiresAt;
    private String deviceCodeMetadata;

}