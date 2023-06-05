// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.muehlbachler.pulumi.proxmoxve.Permission.outputs;

import com.pulumi.core.annotations.CustomType;
import io.muehlbachler.pulumi.proxmoxve.Permission.outputs.GetGroupAcl;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGroupResult {
    private List<GetGroupAcl> acls;
    private String comment;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> members;

    private GetGroupResult() {}
    public List<GetGroupAcl> acls() {
        return this.acls;
    }
    public String comment() {
        return this.comment;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> members() {
        return this.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetGroupAcl> acls;
        private String comment;
        private String groupId;
        private String id;
        private List<String> members;
        public Builder() {}
        public Builder(GetGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acls = defaults.acls;
    	      this.comment = defaults.comment;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.members = defaults.members;
        }

        @CustomType.Setter
        public Builder acls(List<GetGroupAcl> acls) {
            this.acls = Objects.requireNonNull(acls);
            return this;
        }
        public Builder acls(GetGroupAcl... acls) {
            return acls(List.of(acls));
        }
        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder members(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }
        public GetGroupResult build() {
            final var o = new GetGroupResult();
            o.acls = acls;
            o.comment = comment;
            o.groupId = groupId;
            o.id = id;
            o.members = members;
            return o;
        }
    }
}