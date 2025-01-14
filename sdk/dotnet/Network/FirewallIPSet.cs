// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network
{
    [ProxmoxVEResourceType("proxmoxve:Network/firewallIPSet:FirewallIPSet")]
    public partial class FirewallIPSet : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of IP or Networks
        /// </summary>
        [Output("cidrs")]
        public Output<ImmutableArray<Outputs.FirewallIPSetCidr>> Cidrs { get; private set; } = null!;

        /// <summary>
        /// IPSet comment
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Output("containerId")]
        public Output<int?> ContainerId { get; private set; } = null!;

        /// <summary>
        /// IPSet name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Output("nodeName")]
        public Output<string?> NodeName { get; private set; } = null!;

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Output("vmId")]
        public Output<int?> VmId { get; private set; } = null!;


        /// <summary>
        /// Create a FirewallIPSet resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FirewallIPSet(string name, FirewallIPSetArgs? args = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, args ?? new FirewallIPSetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FirewallIPSet(string name, Input<string> id, FirewallIPSetState? state = null, CustomResourceOptions? options = null)
            : base("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/muhlba91/pulumi-proxmoxve",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FirewallIPSet resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FirewallIPSet Get(string name, Input<string> id, FirewallIPSetState? state = null, CustomResourceOptions? options = null)
        {
            return new FirewallIPSet(name, id, state, options);
        }
    }

    public sealed class FirewallIPSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrs")]
        private InputList<Inputs.FirewallIPSetCidrArgs>? _cidrs;

        /// <summary>
        /// List of IP or Networks
        /// </summary>
        public InputList<Inputs.FirewallIPSetCidrArgs> Cidrs
        {
            get => _cidrs ?? (_cidrs = new InputList<Inputs.FirewallIPSetCidrArgs>());
            set => _cidrs = value;
        }

        /// <summary>
        /// IPSet comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Input("containerId")]
        public Input<int>? ContainerId { get; set; }

        /// <summary>
        /// IPSet name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public FirewallIPSetArgs()
        {
        }
        public static new FirewallIPSetArgs Empty => new FirewallIPSetArgs();
    }

    public sealed class FirewallIPSetState : global::Pulumi.ResourceArgs
    {
        [Input("cidrs")]
        private InputList<Inputs.FirewallIPSetCidrGetArgs>? _cidrs;

        /// <summary>
        /// List of IP or Networks
        /// </summary>
        public InputList<Inputs.FirewallIPSetCidrGetArgs> Cidrs
        {
            get => _cidrs ?? (_cidrs = new InputList<Inputs.FirewallIPSetCidrGetArgs>());
            set => _cidrs = value;
        }

        /// <summary>
        /// IPSet comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// The ID of the container to manage the firewall for.
        /// </summary>
        [Input("containerId")]
        public Input<int>? ContainerId { get; set; }

        /// <summary>
        /// IPSet name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The name of the node.
        /// </summary>
        [Input("nodeName")]
        public Input<string>? NodeName { get; set; }

        /// <summary>
        /// The ID of the VM to manage the firewall for.
        /// </summary>
        [Input("vmId")]
        public Input<int>? VmId { get; set; }

        public FirewallIPSetState()
        {
        }
        public static new FirewallIPSetState Empty => new FirewallIPSetState();
    }
}
