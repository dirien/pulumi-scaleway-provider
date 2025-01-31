// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMarketplaceImagePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMarketplaceImagePlainArgs Empty = new GetMarketplaceImagePlainArgs();

    /**
     * The instance type the image is compatible with.
     * You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
     * 
     */
    @Import(name="instanceType")
    private @Nullable String instanceType;

    /**
     * @return The instance type the image is compatible with.
     * You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }

    /**
     * Exact label of the desired image. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&amp;per_page=100)
     * to find the right `label`.
     * 
     */
    @Import(name="label", required=true)
    private String label;

    /**
     * @return Exact label of the desired image. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&amp;per_page=100)
     * to find the right `label`.
     * 
     */
    public String label() {
        return this.label;
    }

    /**
     * `zone`) The zone in which the image exists.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return `zone`) The zone in which the image exists.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetMarketplaceImagePlainArgs() {}

    private GetMarketplaceImagePlainArgs(GetMarketplaceImagePlainArgs $) {
        this.instanceType = $.instanceType;
        this.label = $.label;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMarketplaceImagePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMarketplaceImagePlainArgs $;

        public Builder() {
            $ = new GetMarketplaceImagePlainArgs();
        }

        public Builder(GetMarketplaceImagePlainArgs defaults) {
            $ = new GetMarketplaceImagePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceType The instance type the image is compatible with.
         * You find all the available types on the [pricing page](https://www.scaleway.com/en/pricing/).
         * 
         * @return builder
         * 
         */
        public Builder instanceType(@Nullable String instanceType) {
            $.instanceType = instanceType;
            return this;
        }

        /**
         * @param label Exact label of the desired image. You can use [this endpoint](https://api-marketplace.scaleway.com/images?page=1&amp;per_page=100)
         * to find the right `label`.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            $.label = label;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the image exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetMarketplaceImagePlainArgs build() {
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
