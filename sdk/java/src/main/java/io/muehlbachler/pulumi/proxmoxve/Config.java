// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve;

import com.pulumi.core.internal.Codegen;
import io.muehlbachler.pulumi.proxmoxve.config.inputs.Ssh;
import io.muehlbachler.pulumi.proxmoxve.config.inputs.VirtualEnvironment;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("proxmoxve");
/**
 * The API token for the Proxmox Virtual Environment API
 * 
 */
    public Optional<String> apiToken() {
        return Codegen.stringProp("apiToken").config(config).get();
    }
/**
 * The endpoint for the Proxmox Virtual Environment API
 * 
 */
    public Optional<String> endpoint() {
        return Codegen.stringProp("endpoint").config(config).get();
    }
/**
 * Whether to skip the TLS verification step
 * 
 */
    public Optional<Boolean> insecure() {
        return Codegen.booleanProp("insecure").config(config).get();
    }
/**
 * The one-time password for the Proxmox Virtual Environment API
 * 
 */
    public Optional<String> otp() {
        return Codegen.stringProp("otp").config(config).get();
    }
/**
 * The password for the Proxmox Virtual Environment API
 * 
 */
    public Optional<String> password() {
        return Codegen.stringProp("password").config(config).get();
    }
/**
 * The SSH connection configuration to a Proxmox node
 * 
 */
    public Optional<Ssh> ssh() {
        return Codegen.objectProp("ssh", Ssh.class).config(config).get();
    }
/**
 * The username for the Proxmox Virtual Environment API
 * 
 */
    public Optional<String> username() {
        return Codegen.stringProp("username").config(config).get();
    }
    public Optional<VirtualEnvironment> virtualEnvironment() {
        return Codegen.objectProp("virtualEnvironment", VirtualEnvironment.class).config(config).get();
    }
}