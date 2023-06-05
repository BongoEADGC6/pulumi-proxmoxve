// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.CT.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ContainerCpuArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerCpuArgs Empty = new ContainerCpuArgs();

    @Import(name="architecture")
    private @Nullable Output<String> architecture;

    public Optional<Output<String>> architecture() {
        return Optional.ofNullable(this.architecture);
    }

    @Import(name="cores")
    private @Nullable Output<Integer> cores;

    public Optional<Output<Integer>> cores() {
        return Optional.ofNullable(this.cores);
    }

    @Import(name="units")
    private @Nullable Output<Integer> units;

    public Optional<Output<Integer>> units() {
        return Optional.ofNullable(this.units);
    }

    private ContainerCpuArgs() {}

    private ContainerCpuArgs(ContainerCpuArgs $) {
        this.architecture = $.architecture;
        this.cores = $.cores;
        this.units = $.units;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerCpuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerCpuArgs $;

        public Builder() {
            $ = new ContainerCpuArgs();
        }

        public Builder(ContainerCpuArgs defaults) {
            $ = new ContainerCpuArgs(Objects.requireNonNull(defaults));
        }

        public Builder architecture(@Nullable Output<String> architecture) {
            $.architecture = architecture;
            return this;
        }

        public Builder architecture(String architecture) {
            return architecture(Output.of(architecture));
        }

        public Builder cores(@Nullable Output<Integer> cores) {
            $.cores = cores;
            return this;
        }

        public Builder cores(Integer cores) {
            return cores(Output.of(cores));
        }

        public Builder units(@Nullable Output<Integer> units) {
            $.units = units;
            return this;
        }

        public Builder units(Integer units) {
            return units(Output.of(units));
        }

        public ContainerCpuArgs build() {
            return $;
        }
    }

}