// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TemDomainArgs extends com.pulumi.resources.ResourceArgs {

    public static final TemDomainArgs Empty = new TemDomainArgs();

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

    private TemDomainArgs() {}

    private TemDomainArgs(TemDomainArgs $) {
        this.name = $.name;
        this.projectId = $.projectId;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TemDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TemDomainArgs $;

        public Builder() {
            $ = new TemDomainArgs();
        }

        public Builder(TemDomainArgs defaults) {
            $ = new TemDomainArgs(Objects.requireNonNull(defaults));
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

        public TemDomainArgs build() {
            return $;
        }
    }

}
