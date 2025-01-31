// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BaremetalServerOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BaremetalServerOptionArgs Empty = new BaremetalServerOptionArgs();

    /**
     * The auto expiration date for compatible options
     * 
     */
    @Import(name="expiresAt")
    private @Nullable Output<String> expiresAt;

    /**
     * @return The auto expiration date for compatible options
     * 
     */
    public Optional<Output<String>> expiresAt() {
        return Optional.ofNullable(this.expiresAt);
    }

    /**
     * The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private BaremetalServerOptionArgs() {}

    private BaremetalServerOptionArgs(BaremetalServerOptionArgs $) {
        this.expiresAt = $.expiresAt;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BaremetalServerOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BaremetalServerOptionArgs $;

        public Builder() {
            $ = new BaremetalServerOptionArgs();
        }

        public Builder(BaremetalServerOptionArgs defaults) {
            $ = new BaremetalServerOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expiresAt The auto expiration date for compatible options
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(@Nullable Output<String> expiresAt) {
            $.expiresAt = expiresAt;
            return this;
        }

        /**
         * @param expiresAt The auto expiration date for compatible options
         * 
         * @return builder
         * 
         */
        public Builder expiresAt(String expiresAt) {
            return expiresAt(Output.of(expiresAt));
        }

        /**
         * @param id The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the option to enable. Use [this endpoint](https://developers.scaleway.com/en/products/baremetal/api/#get-012dcc) to find the available options IDs.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public BaremetalServerOptionArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
