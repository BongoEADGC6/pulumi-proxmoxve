// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.ProxmoxVE.Network.Inputs
{

    public sealed class FirewallRulesRuleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("action")]
        public Input<string>? Action { get; set; }

        [Input("comment")]
        public Input<string>? Comment { get; set; }

        [Input("dest")]
        public Input<string>? Dest { get; set; }

        [Input("dport")]
        public Input<string>? Dport { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("iface")]
        public Input<string>? Iface { get; set; }

        [Input("log")]
        public Input<string>? Log { get; set; }

        [Input("macro")]
        public Input<string>? Macro { get; set; }

        [Input("pos")]
        public Input<int>? Pos { get; set; }

        [Input("proto")]
        public Input<string>? Proto { get; set; }

        [Input("securityGroup")]
        public Input<string>? SecurityGroup { get; set; }

        [Input("source")]
        public Input<string>? Source { get; set; }

        [Input("sport")]
        public Input<string>? Sport { get; set; }

        [Input("type")]
        public Input<string>? Type { get; set; }

        public FirewallRulesRuleGetArgs()
        {
        }
        public static new FirewallRulesRuleGetArgs Empty => new FirewallRulesRuleGetArgs();
    }
}