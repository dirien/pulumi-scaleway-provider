// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIamUserPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIamUserPlainArgs Empty = new GetIamUserPlainArgs();

    /**
     * The email address of the IAM user. Only one of the `email` and `user_id` should be specified.
     * 
     */
    @Import(name="email")
    private @Nullable String email;

    /**
     * @return The email address of the IAM user. Only one of the `email` and `user_id` should be specified.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }

    /**
     * `organization_id`) The ID of the
     * organization the user is associated with. For now, it is necessary to
     * explicitly provide the `organization_id` in the datasource.
     * 
     */
    @Import(name="organizationId")
    private @Nullable String organizationId;

    /**
     * @return `organization_id`) The ID of the
     * organization the user is associated with. For now, it is necessary to
     * explicitly provide the `organization_id` in the datasource.
     * 
     */
    public Optional<String> organizationId() {
        return Optional.ofNullable(this.organizationId);
    }

    /**
     * The ID of the IAM user. Only one of the `email` and `user_id` should be specified.
     * 
     */
    @Import(name="userId")
    private @Nullable String userId;

    /**
     * @return The ID of the IAM user. Only one of the `email` and `user_id` should be specified.
     * 
     */
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    private GetIamUserPlainArgs() {}

    private GetIamUserPlainArgs(GetIamUserPlainArgs $) {
        this.email = $.email;
        this.organizationId = $.organizationId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIamUserPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIamUserPlainArgs $;

        public Builder() {
            $ = new GetIamUserPlainArgs();
        }

        public Builder(GetIamUserPlainArgs defaults) {
            $ = new GetIamUserPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param email The email address of the IAM user. Only one of the `email` and `user_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable String email) {
            $.email = email;
            return this;
        }

        /**
         * @param organizationId `organization_id`) The ID of the
         * organization the user is associated with. For now, it is necessary to
         * explicitly provide the `organization_id` in the datasource.
         * 
         * @return builder
         * 
         */
        public Builder organizationId(@Nullable String organizationId) {
            $.organizationId = organizationId;
            return this;
        }

        /**
         * @param userId The ID of the IAM user. Only one of the `email` and `user_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable String userId) {
            $.userId = userId;
            return this;
        }

        public GetIamUserPlainArgs build() {
            return $;
        }
    }

}