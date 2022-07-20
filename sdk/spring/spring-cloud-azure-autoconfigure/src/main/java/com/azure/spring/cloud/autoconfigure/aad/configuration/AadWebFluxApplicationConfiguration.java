// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.aad.configuration;

import com.azure.spring.cloud.autoconfigure.aad.AadWebFluxSecurityConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * Configure the necessary beans used for Azure AD authentication and authorization.
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
public class AadWebFluxApplicationConfiguration {

    /**
     * Sample configuration to make AzureActiveDirectoryOAuth2UserService take effect.
     */
    @EnableWebFluxSecurity
    @EnableReactiveMethodSecurity
    @ConditionalOnMissingBean(SecurityWebFilterChain.class)
    @ConditionalOnExpression("!'${spring.cloud.azure.active-directory.application-type}'.equalsIgnoreCase('web_application_and_resource_server')")
    public static class DefaultAadWebFluxSecurityConfiguration extends AadWebFluxSecurityConfiguration {

        /**
         * configure
         *
         * @param http the {@link ServerHttpSecurity} to use
         * @return the filter chain
         */
        @Bean
        public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
            return super.serverHttpSecurity(http)
                .authorizeExchange(authorize -> authorize
                    .pathMatchers("/login").permitAll()
                    .anyExchange().authenticated()
                ).build();
        }
    }
}
