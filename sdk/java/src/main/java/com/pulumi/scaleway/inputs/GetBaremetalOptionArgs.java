// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBaremetalOptionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBaremetalOptionArgs Empty = new GetBaremetalOptionArgs();

    /**
     * The option name. Only one of `name` and `option_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The option name. Only one of `name` and `option_id` should be specified.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The option id. Only one of `name` and `option_id` should be specified.
     * 
     */
    @Import(name="optionId")
    private @Nullable Output<String> optionId;

    /**
     * @return The option id. Only one of `name` and `option_id` should be specified.
     * 
     */
    public Optional<Output<String>> optionId() {
        return Optional.ofNullable(this.optionId);
    }

    /**
     * `zone`) The zone in which the option exists.
     * 
     */
    @Import(name="zone")
    private @Nullable Output<String> zone;

    /**
     * @return `zone`) The zone in which the option exists.
     * 
     */
    public Optional<Output<String>> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetBaremetalOptionArgs() {}

    private GetBaremetalOptionArgs(GetBaremetalOptionArgs $) {
        this.name = $.name;
        this.optionId = $.optionId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBaremetalOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBaremetalOptionArgs $;

        public Builder() {
            $ = new GetBaremetalOptionArgs();
        }

        public Builder(GetBaremetalOptionArgs defaults) {
            $ = new GetBaremetalOptionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The option name. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The option name. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param optionId The option id. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder optionId(@Nullable Output<String> optionId) {
            $.optionId = optionId;
            return this;
        }

        /**
         * @param optionId The option id. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder optionId(String optionId) {
            return optionId(Output.of(optionId));
        }

        /**
         * @param zone `zone`) The zone in which the option exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable Output<String> zone) {
            $.zone = zone;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the option exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetBaremetalOptionArgs build() {
            return $;
        }
    }

}