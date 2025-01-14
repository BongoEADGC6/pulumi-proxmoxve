// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatastoresResult {
    private List<Boolean> actives;
    private List<List<String>> contentTypes;
    private List<String> datastoreIds;
    private List<Boolean> enableds;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String nodeName;
    private List<Boolean> shareds;
    private List<Integer> spaceAvailables;
    private List<Integer> spaceTotals;
    private List<Integer> spaceUseds;
    private List<String> types;

    private GetDatastoresResult() {}
    public List<Boolean> actives() {
        return this.actives;
    }
    public List<List<String>> contentTypes() {
        return this.contentTypes;
    }
    public List<String> datastoreIds() {
        return this.datastoreIds;
    }
    public List<Boolean> enableds() {
        return this.enableds;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String nodeName() {
        return this.nodeName;
    }
    public List<Boolean> shareds() {
        return this.shareds;
    }
    public List<Integer> spaceAvailables() {
        return this.spaceAvailables;
    }
    public List<Integer> spaceTotals() {
        return this.spaceTotals;
    }
    public List<Integer> spaceUseds() {
        return this.spaceUseds;
    }
    public List<String> types() {
        return this.types;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatastoresResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Boolean> actives;
        private List<List<String>> contentTypes;
        private List<String> datastoreIds;
        private List<Boolean> enableds;
        private String id;
        private String nodeName;
        private List<Boolean> shareds;
        private List<Integer> spaceAvailables;
        private List<Integer> spaceTotals;
        private List<Integer> spaceUseds;
        private List<String> types;
        public Builder() {}
        public Builder(GetDatastoresResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actives = defaults.actives;
    	      this.contentTypes = defaults.contentTypes;
    	      this.datastoreIds = defaults.datastoreIds;
    	      this.enableds = defaults.enableds;
    	      this.id = defaults.id;
    	      this.nodeName = defaults.nodeName;
    	      this.shareds = defaults.shareds;
    	      this.spaceAvailables = defaults.spaceAvailables;
    	      this.spaceTotals = defaults.spaceTotals;
    	      this.spaceUseds = defaults.spaceUseds;
    	      this.types = defaults.types;
        }

        @CustomType.Setter
        public Builder actives(List<Boolean> actives) {
            this.actives = Objects.requireNonNull(actives);
            return this;
        }
        public Builder actives(Boolean... actives) {
            return actives(List.of(actives));
        }
        @CustomType.Setter
        public Builder contentTypes(List<List<String>> contentTypes) {
            this.contentTypes = Objects.requireNonNull(contentTypes);
            return this;
        }
        @CustomType.Setter
        public Builder datastoreIds(List<String> datastoreIds) {
            this.datastoreIds = Objects.requireNonNull(datastoreIds);
            return this;
        }
        public Builder datastoreIds(String... datastoreIds) {
            return datastoreIds(List.of(datastoreIds));
        }
        @CustomType.Setter
        public Builder enableds(List<Boolean> enableds) {
            this.enableds = Objects.requireNonNull(enableds);
            return this;
        }
        public Builder enableds(Boolean... enableds) {
            return enableds(List.of(enableds));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder nodeName(String nodeName) {
            this.nodeName = Objects.requireNonNull(nodeName);
            return this;
        }
        @CustomType.Setter
        public Builder shareds(List<Boolean> shareds) {
            this.shareds = Objects.requireNonNull(shareds);
            return this;
        }
        public Builder shareds(Boolean... shareds) {
            return shareds(List.of(shareds));
        }
        @CustomType.Setter
        public Builder spaceAvailables(List<Integer> spaceAvailables) {
            this.spaceAvailables = Objects.requireNonNull(spaceAvailables);
            return this;
        }
        public Builder spaceAvailables(Integer... spaceAvailables) {
            return spaceAvailables(List.of(spaceAvailables));
        }
        @CustomType.Setter
        public Builder spaceTotals(List<Integer> spaceTotals) {
            this.spaceTotals = Objects.requireNonNull(spaceTotals);
            return this;
        }
        public Builder spaceTotals(Integer... spaceTotals) {
            return spaceTotals(List.of(spaceTotals));
        }
        @CustomType.Setter
        public Builder spaceUseds(List<Integer> spaceUseds) {
            this.spaceUseds = Objects.requireNonNull(spaceUseds);
            return this;
        }
        public Builder spaceUseds(Integer... spaceUseds) {
            return spaceUseds(List.of(spaceUseds));
        }
        @CustomType.Setter
        public Builder types(List<String> types) {
            this.types = Objects.requireNonNull(types);
            return this;
        }
        public Builder types(String... types) {
            return types(List.of(types));
        }
        public GetDatastoresResult build() {
            final var o = new GetDatastoresResult();
            o.actives = actives;
            o.contentTypes = contentTypes;
            o.datastoreIds = datastoreIds;
            o.enableds = enableds;
            o.id = id;
            o.nodeName = nodeName;
            o.shareds = shareds;
            o.spaceAvailables = spaceAvailables;
            o.spaceTotals = spaceTotals;
            o.spaceUseds = spaceUseds;
            o.types = types;
            return o;
        }
    }
}
