// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.scaleway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBaremetalOptionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBaremetalOptionPlainArgs Empty = new GetBaremetalOptionPlainArgs();

    /**
     * The option name. Only one of `name` and `option_id` should be specified.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The option name. Only one of `name` and `option_id` should be specified.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The option id. Only one of `name` and `option_id` should be specified.
     * 
     */
    @Import(name="optionId")
    private @Nullable String optionId;

    /**
     * @return The option id. Only one of `name` and `option_id` should be specified.
     * 
     */
    public Optional<String> optionId() {
        return Optional.ofNullable(this.optionId);
    }

    /**
     * `zone`) The zone in which the option exists.
     * 
     */
    @Import(name="zone")
    private @Nullable String zone;

    /**
     * @return `zone`) The zone in which the option exists.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    private GetBaremetalOptionPlainArgs() {}

    private GetBaremetalOptionPlainArgs(GetBaremetalOptionPlainArgs $) {
        this.name = $.name;
        this.optionId = $.optionId;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBaremetalOptionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBaremetalOptionPlainArgs $;

        public Builder() {
            $ = new GetBaremetalOptionPlainArgs();
        }

        public Builder(GetBaremetalOptionPlainArgs defaults) {
            $ = new GetBaremetalOptionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The option name. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param optionId The option id. Only one of `name` and `option_id` should be specified.
         * 
         * @return builder
         * 
         */
        public Builder optionId(@Nullable String optionId) {
            $.optionId = optionId;
            return this;
        }

        /**
         * @param zone `zone`) The zone in which the option exists.
         * 
         * @return builder
         * 
         */
        public Builder zone(@Nullable String zone) {
            $.zone = zone;
            return this;
        }

        public GetBaremetalOptionPlainArgs build() {
            return $;
        }
    }

}
