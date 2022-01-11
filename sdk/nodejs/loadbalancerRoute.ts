// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

export class LoadbalancerRoute extends pulumi.CustomResource {
    /**
     * Get an existing LoadbalancerRoute resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LoadbalancerRouteState, opts?: pulumi.CustomResourceOptions): LoadbalancerRoute {
        return new LoadbalancerRoute(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'scaleway:index/loadbalancerRoute:LoadbalancerRoute';

    /**
     * Returns true if the given object is an instance of LoadbalancerRoute.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is LoadbalancerRoute {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === LoadbalancerRoute.__pulumiType;
    }

    /**
     * The backend ID destination of redirection
     */
    public readonly backendId!: pulumi.Output<string>;
    /**
     * The frontend ID origin of redirection
     */
    public readonly frontendId!: pulumi.Output<string>;
    /**
     * The domain to match against
     */
    public readonly matchSni!: pulumi.Output<string | undefined>;

    /**
     * Create a LoadbalancerRoute resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LoadbalancerRouteArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LoadbalancerRouteArgs | LoadbalancerRouteState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as LoadbalancerRouteState | undefined;
            inputs["backendId"] = state ? state.backendId : undefined;
            inputs["frontendId"] = state ? state.frontendId : undefined;
            inputs["matchSni"] = state ? state.matchSni : undefined;
        } else {
            const args = argsOrState as LoadbalancerRouteArgs | undefined;
            if ((!args || args.backendId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'backendId'");
            }
            if ((!args || args.frontendId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'frontendId'");
            }
            inputs["backendId"] = args ? args.backendId : undefined;
            inputs["frontendId"] = args ? args.frontendId : undefined;
            inputs["matchSni"] = args ? args.matchSni : undefined;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(LoadbalancerRoute.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering LoadbalancerRoute resources.
 */
export interface LoadbalancerRouteState {
    /**
     * The backend ID destination of redirection
     */
    backendId?: pulumi.Input<string>;
    /**
     * The frontend ID origin of redirection
     */
    frontendId?: pulumi.Input<string>;
    /**
     * The domain to match against
     */
    matchSni?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a LoadbalancerRoute resource.
 */
export interface LoadbalancerRouteArgs {
    /**
     * The backend ID destination of redirection
     */
    backendId: pulumi.Input<string>;
    /**
     * The frontend ID origin of redirection
     */
    frontendId: pulumi.Input<string>;
    /**
     * The domain to match against
     */
    matchSni?: pulumi.Input<string>;
}
