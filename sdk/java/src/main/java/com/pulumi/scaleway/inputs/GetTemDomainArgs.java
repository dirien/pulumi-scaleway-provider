// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTemDomainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTemDomainArgs Empty = new GetTemDomainArgs();

    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * The domain name.
     * Only one of `name` and `id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The domain name.
     * Only one of `name` and `id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * `region`) The region in which the domain exists.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return `region`) The region in which the domain exists.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetTemDomainArgs() {}

    private GetTemDomainArgs(GetTemDomainArgs $) {
        this.domainId = $.domainId;
        this.name = $.name;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTemDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTemDomainArgs $;

        public Builder() {
            $ = new GetTemDomainArgs();
        }

        public Builder(GetTemDomainArgs defaults) {
            $ = new GetTemDomainArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        /**
         * @param name The domain name.
         * Only one of `name` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The domain name.
         * Only one of `name` and `id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param region `region`) The region in which the domain exists.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region `region`) The region in which the domain exists.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetTemDomainArgs build() {
            return $;
        }
    }

}
