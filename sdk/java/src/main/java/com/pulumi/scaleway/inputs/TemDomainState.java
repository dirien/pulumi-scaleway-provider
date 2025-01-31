// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemDomainState extends com.pulumi.resources.ResourceArgs {

    public static final TemDomainState Empty = new TemDomainState();

    /**
     * The date and time of the Transaction Email Domain&#39;s creation (RFC 3339 format).
     * 
     */
    @Import(name="createdAt")
    private @Nullable Output<String> createdAt;

    /**
     * @return The date and time of the Transaction Email Domain&#39;s creation (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> createdAt() {
        return Optional.ofNullable(this.createdAt);
    }

    /**
     * The DKIM public key, as should be recorded in the DNS zone.
     * 
     */
    @Import(name="dkimConfig")
    private @Nullable Output<String> dkimConfig;

    /**
     * @return The DKIM public key, as should be recorded in the DNS zone.
     * 
     */
    public Optional<Output<String>> dkimConfig() {
        return Optional.ofNullable(this.dkimConfig);
    }

    /**
     * The error message if the last check failed.
     * 
     */
    @Import(name="lastError")
    private @Nullable Output<String> lastError;

    /**
     * @return The error message if the last check failed.
     * 
     */
    public Optional<Output<String>> lastError() {
        return Optional.ofNullable(this.lastError);
    }

    /**
     * The date and time the domain was last found to be valid (RFC 3339 format).
     * 
     */
    @Import(name="lastValidAt")
    private @Nullable Output<String> lastValidAt;

    /**
     * @return The date and time the domain was last found to be valid (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> lastValidAt() {
        return Optional.ofNullable(this.lastValidAt);
    }

    /**
     * The domain name, must not be used in another Transactional Email Domain.
     * &gt; **Important** Updates to `name` will recreate the domain.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The domain name, must not be used in another Transactional Email Domain.
     * &gt; **Important** Updates to `name` will recreate the domain.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The date and time of the next scheduled check (RFC 3339 format).
     * 
     */
    @Import(name="nextCheckAt")
    private @Nullable Output<String> nextCheckAt;

    /**
     * @return The date and time of the next scheduled check (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> nextCheckAt() {
        return Optional.ofNullable(this.nextCheckAt);
    }

    /**
     * `project_id`) The ID of the project the domain is associated with.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return `project_id`) The ID of the project the domain is associated with.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * `region`). The region in which the domain should be created.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`). The region in which the domain should be created.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The date and time of the revocation of the domain (RFC 3339 format).
     * 
     */
    @Import(name="revokedAt")
    private @Nullable Output<String> revokedAt;

    /**
     * @return The date and time of the revocation of the domain (RFC 3339 format).
     * 
     */
    public Optional<Output<String>> revokedAt() {
        return Optional.ofNullable(this.revokedAt);
    }

    /**
     * The snippet of the SPF record that should be registered in the DNS zone.
     * 
     */
    @Import(name="spfConfig")
    private @Nullable Output<String> spfConfig;

    /**
     * @return The snippet of the SPF record that should be registered in the DNS zone.
     * 
     */
    public Optional<Output<String>> spfConfig() {
        return Optional.ofNullable(this.spfConfig);
    }

    /**
     * The status of the Transaction Email Domain.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return The status of the Transaction Email Domain.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    private TemDomainState() {}

    private TemDomainState(TemDomainState $) {
        this.createdAt = $.createdAt;
        this.dkimConfig = $.dkimConfig;
        this.lastError = $.lastError;
        this.lastValidAt = $.lastValidAt;
        this.name = $.name;
        this.nextCheckAt = $.nextCheckAt;
        this.projectId = $.projectId;
        this.region = $.region;
        this.revokedAt = $.revokedAt;
        this.spfConfig = $.spfConfig;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemDomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemDomainState $;

        public Builder() {
            $ = new TemDomainState();
        }

        public Builder(TemDomainState defaults) {
            $ = new TemDomainState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdAt The date and time of the Transaction Email Domain&#39;s creation (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(@Nullable Output<String> createdAt) {
            $.createdAt = createdAt;
            return this;
        }

        /**
         * @param createdAt The date and time of the Transaction Email Domain&#39;s creation (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder createdAt(String createdAt) {
            return createdAt(Output.of(createdAt));
        }

        /**
         * @param dkimConfig The DKIM public key, as should be recorded in the DNS zone.
         * 
         * @return builder
         * 
         */
        public Builder dkimConfig(@Nullable Output<String> dkimConfig) {
            $.dkimConfig = dkimConfig;
            return this;
        }

        /**
         * @param dkimConfig The DKIM public key, as should be recorded in the DNS zone.
         * 
         * @return builder
         * 
         */
        public Builder dkimConfig(String dkimConfig) {
            return dkimConfig(Output.of(dkimConfig));
        }

        /**
         * @param lastError The error message if the last check failed.
         * 
         * @return builder
         * 
         */
        public Builder lastError(@Nullable Output<String> lastError) {
            $.lastError = lastError;
            return this;
        }

        /**
         * @param lastError The error message if the last check failed.
         * 
         * @return builder
         * 
         */
        public Builder lastError(String lastError) {
            return lastError(Output.of(lastError));
        }

        /**
         * @param lastValidAt The date and time the domain was last found to be valid (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder lastValidAt(@Nullable Output<String> lastValidAt) {
            $.lastValidAt = lastValidAt;
            return this;
        }

        /**
         * @param lastValidAt The date and time the domain was last found to be valid (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder lastValidAt(String lastValidAt) {
            return lastValidAt(Output.of(lastValidAt));
        }

        /**
         * @param name The domain name, must not be used in another Transactional Email Domain.
         * &gt; **Important** Updates to `name` will recreate the domain.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The domain name, must not be used in another Transactional Email Domain.
         * &gt; **Important** Updates to `name` will recreate the domain.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param nextCheckAt The date and time of the next scheduled check (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder nextCheckAt(@Nullable Output<String> nextCheckAt) {
            $.nextCheckAt = nextCheckAt;
            return this;
        }

        /**
         * @param nextCheckAt The date and time of the next scheduled check (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder nextCheckAt(String nextCheckAt) {
            return nextCheckAt(Output.of(nextCheckAt));
        }

        /**
         * @param projectId `project_id`) The ID of the project the domain is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId `project_id`) The ID of the project the domain is associated with.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region `region`). The region in which the domain should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`). The region in which the domain should be created.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param revokedAt The date and time of the revocation of the domain (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder revokedAt(@Nullable Output<String> revokedAt) {
            $.revokedAt = revokedAt;
            return this;
        }

        /**
         * @param revokedAt The date and time of the revocation of the domain (RFC 3339 format).
         * 
         * @return builder
         * 
         */
        public Builder revokedAt(String revokedAt) {
            return revokedAt(Output.of(revokedAt));
        }

        /**
         * @param spfConfig The snippet of the SPF record that should be registered in the DNS zone.
         * 
         * @return builder
         * 
         */
        public Builder spfConfig(@Nullable Output<String> spfConfig) {
            $.spfConfig = spfConfig;
            return this;
        }

        /**
         * @param spfConfig The snippet of the SPF record that should be registered in the DNS zone.
         * 
         * @return builder
         * 
         */
        public Builder spfConfig(String spfConfig) {
            return spfConfig(Output.of(spfConfig));
        }

        /**
         * @param status The status of the Transaction Email Domain.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The status of the Transaction Email Domain.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        public TemDomainState build() {
            return $;
        }
    }

}
