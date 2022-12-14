/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.apache.hudi.avro.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class HoodieMetadataFileInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7809948218412971595L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"HoodieMetadataFileInfo\",\"namespace\":\"org.apache.hudi.avro.model\",\"fields\":[{\"name\":\"size\",\"type\":\"long\",\"doc\":\"Size of the file\"},{\"name\":\"isDeleted\",\"type\":\"boolean\",\"doc\":\"True if this file has been deleted\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<HoodieMetadataFileInfo> ENCODER =
      new BinaryMessageEncoder<HoodieMetadataFileInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<HoodieMetadataFileInfo> DECODER =
      new BinaryMessageDecoder<HoodieMetadataFileInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<HoodieMetadataFileInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<HoodieMetadataFileInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<HoodieMetadataFileInfo>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this HoodieMetadataFileInfo to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a HoodieMetadataFileInfo from a ByteBuffer. */
  public static HoodieMetadataFileInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** Size of the file */
  @Deprecated public long size;
  /** True if this file has been deleted */
  @Deprecated public boolean isDeleted;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public HoodieMetadataFileInfo() {}

  /**
   * All-args constructor.
   * @param size Size of the file
   * @param isDeleted True if this file has been deleted
   */
  public HoodieMetadataFileInfo(java.lang.Long size, java.lang.Boolean isDeleted) {
    this.size = size;
    this.isDeleted = isDeleted;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return size;
    case 1: return isDeleted;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: size = (java.lang.Long)value$; break;
    case 1: isDeleted = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'size' field.
   * @return Size of the file
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * Sets the value of the 'size' field.
   * Size of the file
   * @param value the value to set.
   */
  public void setSize(java.lang.Long value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'isDeleted' field.
   * @return True if this file has been deleted
   */
  public java.lang.Boolean getIsDeleted() {
    return isDeleted;
  }

  /**
   * Sets the value of the 'isDeleted' field.
   * True if this file has been deleted
   * @param value the value to set.
   */
  public void setIsDeleted(java.lang.Boolean value) {
    this.isDeleted = value;
  }

  /**
   * Creates a new HoodieMetadataFileInfo RecordBuilder.
   * @return A new HoodieMetadataFileInfo RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder newBuilder() {
    return new org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder();
  }

  /**
   * Creates a new HoodieMetadataFileInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new HoodieMetadataFileInfo RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder newBuilder(org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder other) {
    return new org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder(other);
  }

  /**
   * Creates a new HoodieMetadataFileInfo RecordBuilder by copying an existing HoodieMetadataFileInfo instance.
   * @param other The existing instance to copy.
   * @return A new HoodieMetadataFileInfo RecordBuilder
   */
  public static org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder newBuilder(org.apache.hudi.avro.model.HoodieMetadataFileInfo other) {
    return new org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder(other);
  }

  /**
   * RecordBuilder for HoodieMetadataFileInfo instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<HoodieMetadataFileInfo>
    implements org.apache.avro.data.RecordBuilder<HoodieMetadataFileInfo> {

    /** Size of the file */
    private long size;
    /** True if this file has been deleted */
    private boolean isDeleted;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.size)) {
        this.size = data().deepCopy(fields()[0].schema(), other.size);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[1].schema(), other.isDeleted);
        fieldSetFlags()[1] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing HoodieMetadataFileInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(org.apache.hudi.avro.model.HoodieMetadataFileInfo other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.size)) {
        this.size = data().deepCopy(fields()[0].schema(), other.size);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.isDeleted)) {
        this.isDeleted = data().deepCopy(fields()[1].schema(), other.isDeleted);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'size' field.
      * Size of the file
      * @return The value.
      */
    public java.lang.Long getSize() {
      return size;
    }

    /**
      * Sets the value of the 'size' field.
      * Size of the file
      * @param value The value of 'size'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder setSize(long value) {
      validate(fields()[0], value);
      this.size = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'size' field has been set.
      * Size of the file
      * @return True if the 'size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'size' field.
      * Size of the file
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder clearSize() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'isDeleted' field.
      * True if this file has been deleted
      * @return The value.
      */
    public java.lang.Boolean getIsDeleted() {
      return isDeleted;
    }

    /**
      * Sets the value of the 'isDeleted' field.
      * True if this file has been deleted
      * @param value The value of 'isDeleted'.
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder setIsDeleted(boolean value) {
      validate(fields()[1], value);
      this.isDeleted = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'isDeleted' field has been set.
      * True if this file has been deleted
      * @return True if the 'isDeleted' field has been set, false otherwise.
      */
    public boolean hasIsDeleted() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'isDeleted' field.
      * True if this file has been deleted
      * @return This builder.
      */
    public org.apache.hudi.avro.model.HoodieMetadataFileInfo.Builder clearIsDeleted() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public HoodieMetadataFileInfo build() {
      try {
        HoodieMetadataFileInfo record = new HoodieMetadataFileInfo();
        record.size = fieldSetFlags()[0] ? this.size : (java.lang.Long) defaultValue(fields()[0]);
        record.isDeleted = fieldSetFlags()[1] ? this.isDeleted : (java.lang.Boolean) defaultValue(fields()[1]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<HoodieMetadataFileInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<HoodieMetadataFileInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<HoodieMetadataFileInfo>
    READER$ = (org.apache.avro.io.DatumReader<HoodieMetadataFileInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
