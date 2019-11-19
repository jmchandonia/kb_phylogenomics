
package us.kbase.kbphylogenomics;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: trim_speciestree_to_genomeset_Input</p>
 * <pre>
 * trim_speciestree_to_genomeset()
 * **
 * ** reduce tree to match genomes found in genomeset
 * </pre>
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "workspace_name",
    "input_genomeSet_ref",
    "input_tree_ref",
    "output_tree_name",
    "desc",
    "genome_disp_name_config",
    "show_skeleton_genome_sci_name",
    "enforce_genome_version_match",
    "reference_genome_ref_dict",
    "skeleton_genome_ref_dict",
    "user_genome_ref_dict",
    "color_for_reference_genomes",
    "color_for_skeleton_genomes",
    "color_for_user_genomes",
    "tree_shape"
})
public class TrimSpeciestreeToGenomesetInput {

    @JsonProperty("workspace_name")
    private java.lang.String workspaceName;
    @JsonProperty("input_genomeSet_ref")
    private java.lang.String inputGenomeSetRef;
    @JsonProperty("input_tree_ref")
    private java.lang.String inputTreeRef;
    @JsonProperty("output_tree_name")
    private java.lang.String outputTreeName;
    @JsonProperty("desc")
    private java.lang.String desc;
    @JsonProperty("genome_disp_name_config")
    private java.lang.String genomeDispNameConfig;
    @JsonProperty("show_skeleton_genome_sci_name")
    private Long showSkeletonGenomeSciName;
    @JsonProperty("enforce_genome_version_match")
    private Long enforceGenomeVersionMatch;
    @JsonProperty("reference_genome_ref_dict")
    private Map<String, String> referenceGenomeRefDict;
    @JsonProperty("skeleton_genome_ref_dict")
    private Map<String, String> skeletonGenomeRefDict;
    @JsonProperty("user_genome_ref_dict")
    private Map<String, String> userGenomeRefDict;
    @JsonProperty("color_for_reference_genomes")
    private java.lang.String colorForReferenceGenomes;
    @JsonProperty("color_for_skeleton_genomes")
    private java.lang.String colorForSkeletonGenomes;
    @JsonProperty("color_for_user_genomes")
    private java.lang.String colorForUserGenomes;
    @JsonProperty("tree_shape")
    private java.lang.String treeShape;
    private Map<java.lang.String, Object> additionalProperties = new HashMap<java.lang.String, Object>();

    @JsonProperty("workspace_name")
    public java.lang.String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public TrimSpeciestreeToGenomesetInput withWorkspaceName(java.lang.String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("input_genomeSet_ref")
    public java.lang.String getInputGenomeSetRef() {
        return inputGenomeSetRef;
    }

    @JsonProperty("input_genomeSet_ref")
    public void setInputGenomeSetRef(java.lang.String inputGenomeSetRef) {
        this.inputGenomeSetRef = inputGenomeSetRef;
    }

    public TrimSpeciestreeToGenomesetInput withInputGenomeSetRef(java.lang.String inputGenomeSetRef) {
        this.inputGenomeSetRef = inputGenomeSetRef;
        return this;
    }

    @JsonProperty("input_tree_ref")
    public java.lang.String getInputTreeRef() {
        return inputTreeRef;
    }

    @JsonProperty("input_tree_ref")
    public void setInputTreeRef(java.lang.String inputTreeRef) {
        this.inputTreeRef = inputTreeRef;
    }

    public TrimSpeciestreeToGenomesetInput withInputTreeRef(java.lang.String inputTreeRef) {
        this.inputTreeRef = inputTreeRef;
        return this;
    }

    @JsonProperty("output_tree_name")
    public java.lang.String getOutputTreeName() {
        return outputTreeName;
    }

    @JsonProperty("output_tree_name")
    public void setOutputTreeName(java.lang.String outputTreeName) {
        this.outputTreeName = outputTreeName;
    }

    public TrimSpeciestreeToGenomesetInput withOutputTreeName(java.lang.String outputTreeName) {
        this.outputTreeName = outputTreeName;
        return this;
    }

    @JsonProperty("desc")
    public java.lang.String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }

    public TrimSpeciestreeToGenomesetInput withDesc(java.lang.String desc) {
        this.desc = desc;
        return this;
    }

    @JsonProperty("genome_disp_name_config")
    public java.lang.String getGenomeDispNameConfig() {
        return genomeDispNameConfig;
    }

    @JsonProperty("genome_disp_name_config")
    public void setGenomeDispNameConfig(java.lang.String genomeDispNameConfig) {
        this.genomeDispNameConfig = genomeDispNameConfig;
    }

    public TrimSpeciestreeToGenomesetInput withGenomeDispNameConfig(java.lang.String genomeDispNameConfig) {
        this.genomeDispNameConfig = genomeDispNameConfig;
        return this;
    }

    @JsonProperty("show_skeleton_genome_sci_name")
    public Long getShowSkeletonGenomeSciName() {
        return showSkeletonGenomeSciName;
    }

    @JsonProperty("show_skeleton_genome_sci_name")
    public void setShowSkeletonGenomeSciName(Long showSkeletonGenomeSciName) {
        this.showSkeletonGenomeSciName = showSkeletonGenomeSciName;
    }

    public TrimSpeciestreeToGenomesetInput withShowSkeletonGenomeSciName(Long showSkeletonGenomeSciName) {
        this.showSkeletonGenomeSciName = showSkeletonGenomeSciName;
        return this;
    }

    @JsonProperty("enforce_genome_version_match")
    public Long getEnforceGenomeVersionMatch() {
        return enforceGenomeVersionMatch;
    }

    @JsonProperty("enforce_genome_version_match")
    public void setEnforceGenomeVersionMatch(Long enforceGenomeVersionMatch) {
        this.enforceGenomeVersionMatch = enforceGenomeVersionMatch;
    }

    public TrimSpeciestreeToGenomesetInput withEnforceGenomeVersionMatch(Long enforceGenomeVersionMatch) {
        this.enforceGenomeVersionMatch = enforceGenomeVersionMatch;
        return this;
    }

    @JsonProperty("reference_genome_ref_dict")
    public Map<String, String> getReferenceGenomeRefDict() {
        return referenceGenomeRefDict;
    }

    @JsonProperty("reference_genome_ref_dict")
    public void setReferenceGenomeRefDict(Map<String, String> referenceGenomeRefDict) {
        this.referenceGenomeRefDict = referenceGenomeRefDict;
    }

    public TrimSpeciestreeToGenomesetInput withReferenceGenomeRefDict(Map<String, String> referenceGenomeRefDict) {
        this.referenceGenomeRefDict = referenceGenomeRefDict;
        return this;
    }

    @JsonProperty("skeleton_genome_ref_dict")
    public Map<String, String> getSkeletonGenomeRefDict() {
        return skeletonGenomeRefDict;
    }

    @JsonProperty("skeleton_genome_ref_dict")
    public void setSkeletonGenomeRefDict(Map<String, String> skeletonGenomeRefDict) {
        this.skeletonGenomeRefDict = skeletonGenomeRefDict;
    }

    public TrimSpeciestreeToGenomesetInput withSkeletonGenomeRefDict(Map<String, String> skeletonGenomeRefDict) {
        this.skeletonGenomeRefDict = skeletonGenomeRefDict;
        return this;
    }

    @JsonProperty("user_genome_ref_dict")
    public Map<String, String> getUserGenomeRefDict() {
        return userGenomeRefDict;
    }

    @JsonProperty("user_genome_ref_dict")
    public void setUserGenomeRefDict(Map<String, String> userGenomeRefDict) {
        this.userGenomeRefDict = userGenomeRefDict;
    }

    public TrimSpeciestreeToGenomesetInput withUserGenomeRefDict(Map<String, String> userGenomeRefDict) {
        this.userGenomeRefDict = userGenomeRefDict;
        return this;
    }

    @JsonProperty("color_for_reference_genomes")
    public java.lang.String getColorForReferenceGenomes() {
        return colorForReferenceGenomes;
    }

    @JsonProperty("color_for_reference_genomes")
    public void setColorForReferenceGenomes(java.lang.String colorForReferenceGenomes) {
        this.colorForReferenceGenomes = colorForReferenceGenomes;
    }

    public TrimSpeciestreeToGenomesetInput withColorForReferenceGenomes(java.lang.String colorForReferenceGenomes) {
        this.colorForReferenceGenomes = colorForReferenceGenomes;
        return this;
    }

    @JsonProperty("color_for_skeleton_genomes")
    public java.lang.String getColorForSkeletonGenomes() {
        return colorForSkeletonGenomes;
    }

    @JsonProperty("color_for_skeleton_genomes")
    public void setColorForSkeletonGenomes(java.lang.String colorForSkeletonGenomes) {
        this.colorForSkeletonGenomes = colorForSkeletonGenomes;
    }

    public TrimSpeciestreeToGenomesetInput withColorForSkeletonGenomes(java.lang.String colorForSkeletonGenomes) {
        this.colorForSkeletonGenomes = colorForSkeletonGenomes;
        return this;
    }

    @JsonProperty("color_for_user_genomes")
    public java.lang.String getColorForUserGenomes() {
        return colorForUserGenomes;
    }

    @JsonProperty("color_for_user_genomes")
    public void setColorForUserGenomes(java.lang.String colorForUserGenomes) {
        this.colorForUserGenomes = colorForUserGenomes;
    }

    public TrimSpeciestreeToGenomesetInput withColorForUserGenomes(java.lang.String colorForUserGenomes) {
        this.colorForUserGenomes = colorForUserGenomes;
        return this;
    }

    @JsonProperty("tree_shape")
    public java.lang.String getTreeShape() {
        return treeShape;
    }

    @JsonProperty("tree_shape")
    public void setTreeShape(java.lang.String treeShape) {
        this.treeShape = treeShape;
    }

    public TrimSpeciestreeToGenomesetInput withTreeShape(java.lang.String treeShape) {
        this.treeShape = treeShape;
        return this;
    }

    @JsonAnyGetter
    public Map<java.lang.String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(java.lang.String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public java.lang.String toString() {
        return ((((((((((((((((((((((((((((((((("TrimSpeciestreeToGenomesetInput"+" [workspaceName=")+ workspaceName)+", inputGenomeSetRef=")+ inputGenomeSetRef)+", inputTreeRef=")+ inputTreeRef)+", outputTreeName=")+ outputTreeName)+", desc=")+ desc)+", genomeDispNameConfig=")+ genomeDispNameConfig)+", showSkeletonGenomeSciName=")+ showSkeletonGenomeSciName)+", enforceGenomeVersionMatch=")+ enforceGenomeVersionMatch)+", referenceGenomeRefDict=")+ referenceGenomeRefDict)+", skeletonGenomeRefDict=")+ skeletonGenomeRefDict)+", userGenomeRefDict=")+ userGenomeRefDict)+", colorForReferenceGenomes=")+ colorForReferenceGenomes)+", colorForSkeletonGenomes=")+ colorForSkeletonGenomes)+", colorForUserGenomes=")+ colorForUserGenomes)+", treeShape=")+ treeShape)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
