
package io.fabric8.openshift.api.model.hive.v1;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "adminKubeconfigSecretRef",
    "adminPasswordSecretRef",
    "clusterID",
    "infraID"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(io.fabric8.kubernetes.api.model.LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@Generated("jsonschema2pojo")
public class ClusterMetadata implements Editable<ClusterMetadataBuilder> , KubernetesResource
{

    @JsonProperty("adminKubeconfigSecretRef")
    private io.fabric8.kubernetes.api.model.LocalObjectReference adminKubeconfigSecretRef;
    @JsonProperty("adminPasswordSecretRef")
    private io.fabric8.kubernetes.api.model.LocalObjectReference adminPasswordSecretRef;
    @JsonProperty("clusterID")
    private String clusterID;
    @JsonProperty("infraID")
    private String infraID;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClusterMetadata() {
    }

    public ClusterMetadata(io.fabric8.kubernetes.api.model.LocalObjectReference adminKubeconfigSecretRef, io.fabric8.kubernetes.api.model.LocalObjectReference adminPasswordSecretRef, String clusterID, String infraID) {
        super();
        this.adminKubeconfigSecretRef = adminKubeconfigSecretRef;
        this.adminPasswordSecretRef = adminPasswordSecretRef;
        this.clusterID = clusterID;
        this.infraID = infraID;
    }

    @JsonProperty("adminKubeconfigSecretRef")
    public io.fabric8.kubernetes.api.model.LocalObjectReference getAdminKubeconfigSecretRef() {
        return adminKubeconfigSecretRef;
    }

    @JsonProperty("adminKubeconfigSecretRef")
    public void setAdminKubeconfigSecretRef(io.fabric8.kubernetes.api.model.LocalObjectReference adminKubeconfigSecretRef) {
        this.adminKubeconfigSecretRef = adminKubeconfigSecretRef;
    }

    @JsonProperty("adminPasswordSecretRef")
    public io.fabric8.kubernetes.api.model.LocalObjectReference getAdminPasswordSecretRef() {
        return adminPasswordSecretRef;
    }

    @JsonProperty("adminPasswordSecretRef")
    public void setAdminPasswordSecretRef(io.fabric8.kubernetes.api.model.LocalObjectReference adminPasswordSecretRef) {
        this.adminPasswordSecretRef = adminPasswordSecretRef;
    }

    @JsonProperty("clusterID")
    public String getClusterID() {
        return clusterID;
    }

    @JsonProperty("clusterID")
    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    @JsonProperty("infraID")
    public String getInfraID() {
        return infraID;
    }

    @JsonProperty("infraID")
    public void setInfraID(String infraID) {
        this.infraID = infraID;
    }

    @JsonIgnore
    public ClusterMetadataBuilder edit() {
        return new ClusterMetadataBuilder(this);
    }

    @JsonIgnore
    public ClusterMetadataBuilder toBuilder() {
        return edit();
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
