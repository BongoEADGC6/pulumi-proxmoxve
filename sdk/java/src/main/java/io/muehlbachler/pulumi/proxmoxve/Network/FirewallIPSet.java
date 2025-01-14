// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Network;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.Network.FirewallIPSetArgs;
import io.muehlbachler.pulumi.proxmoxve.Network.inputs.FirewallIPSetState;
import io.muehlbachler.pulumi.proxmoxve.Network.outputs.FirewallIPSetCidr;
import io.muehlbachler.pulumi.proxmoxve.Utilities;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="proxmoxve:Network/firewallIPSet:FirewallIPSet")
public class FirewallIPSet extends com.pulumi.resources.CustomResource {
    /**
     * List of IP or Networks
     * 
     */
    @Export(name="cidrs", refs={List.class,FirewallIPSetCidr.class}, tree="[0,1]")
    private Output</* @Nullable */ List<FirewallIPSetCidr>> cidrs;

    /**
     * @return List of IP or Networks
     * 
     */
    public Output<Optional<List<FirewallIPSetCidr>>> cidrs() {
        return Codegen.optional(this.cidrs);
    }
    /**
     * IPSet comment
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return IPSet comment
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The ID of the container to manage the firewall for.
     * 
     */
    @Export(name="containerId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> containerId;

    /**
     * @return The ID of the container to manage the firewall for.
     * 
     */
    public Output<Optional<Integer>> containerId() {
        return Codegen.optional(this.containerId);
    }
    /**
     * IPSet name
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return IPSet name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the node.
     * 
     */
    @Export(name="nodeName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> nodeName;

    /**
     * @return The name of the node.
     * 
     */
    public Output<Optional<String>> nodeName() {
        return Codegen.optional(this.nodeName);
    }
    /**
     * The ID of the VM to manage the firewall for.
     * 
     */
    @Export(name="vmId", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> vmId;

    /**
     * @return The ID of the VM to manage the firewall for.
     * 
     */
    public Output<Optional<Integer>> vmId() {
        return Codegen.optional(this.vmId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FirewallIPSet(String name) {
        this(name, FirewallIPSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FirewallIPSet(String name, @Nullable FirewallIPSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FirewallIPSet(String name, @Nullable FirewallIPSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, args == null ? FirewallIPSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FirewallIPSet(String name, Output<String> id, @Nullable FirewallIPSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("proxmoxve:Network/firewallIPSet:FirewallIPSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static FirewallIPSet get(String name, Output<String> id, @Nullable FirewallIPSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FirewallIPSet(name, id, state, options);
    }
}
