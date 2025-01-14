// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export class FirewallIPSet extends pulumi.CustomResource {
    /**
     * Get an existing FirewallIPSet resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: FirewallIPSetState, opts?: pulumi.CustomResourceOptions): FirewallIPSet {
        return new FirewallIPSet(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'proxmoxve:Network/firewallIPSet:FirewallIPSet';

    /**
     * Returns true if the given object is an instance of FirewallIPSet.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is FirewallIPSet {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === FirewallIPSet.__pulumiType;
    }

    /**
     * List of IP or Networks
     */
    public readonly cidrs!: pulumi.Output<outputs.Network.FirewallIPSetCidr[] | undefined>;
    /**
     * IPSet comment
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The ID of the container to manage the firewall for.
     */
    public readonly containerId!: pulumi.Output<number | undefined>;
    /**
     * IPSet name
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The name of the node.
     */
    public readonly nodeName!: pulumi.Output<string | undefined>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    public readonly vmId!: pulumi.Output<number | undefined>;

    /**
     * Create a FirewallIPSet resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: FirewallIPSetArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: FirewallIPSetArgs | FirewallIPSetState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as FirewallIPSetState | undefined;
            resourceInputs["cidrs"] = state ? state.cidrs : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["containerId"] = state ? state.containerId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["nodeName"] = state ? state.nodeName : undefined;
            resourceInputs["vmId"] = state ? state.vmId : undefined;
        } else {
            const args = argsOrState as FirewallIPSetArgs | undefined;
            resourceInputs["cidrs"] = args ? args.cidrs : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["containerId"] = args ? args.containerId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["nodeName"] = args ? args.nodeName : undefined;
            resourceInputs["vmId"] = args ? args.vmId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(FirewallIPSet.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering FirewallIPSet resources.
 */
export interface FirewallIPSetState {
    /**
     * List of IP or Networks
     */
    cidrs?: pulumi.Input<pulumi.Input<inputs.Network.FirewallIPSetCidr>[]>;
    /**
     * IPSet comment
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the container to manage the firewall for.
     */
    containerId?: pulumi.Input<number>;
    /**
     * IPSet name
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    vmId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a FirewallIPSet resource.
 */
export interface FirewallIPSetArgs {
    /**
     * List of IP or Networks
     */
    cidrs?: pulumi.Input<pulumi.Input<inputs.Network.FirewallIPSetCidr>[]>;
    /**
     * IPSet comment
     */
    comment?: pulumi.Input<string>;
    /**
     * The ID of the container to manage the firewall for.
     */
    containerId?: pulumi.Input<number>;
    /**
     * IPSet name
     */
    name?: pulumi.Input<string>;
    /**
     * The name of the node.
     */
    nodeName?: pulumi.Input<string>;
    /**
     * The ID of the VM to manage the firewall for.
     */
    vmId?: pulumi.Input<number>;
}
