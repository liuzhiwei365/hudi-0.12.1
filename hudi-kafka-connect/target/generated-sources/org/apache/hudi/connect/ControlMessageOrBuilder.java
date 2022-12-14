// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ControlMessage.proto

package org.apache.hudi.connect;

public interface ControlMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:connect.ControlMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 protocolVersion = 1;</code>
   * @return The protocolVersion.
   */
  int getProtocolVersion();

  /**
   * <code>.connect.ControlMessage.EventType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.connect.ControlMessage.EventType type = 2;</code>
   * @return The type.
   */
  org.apache.hudi.connect.ControlMessage.EventType getType();

  /**
   * <code>string topic_name = 3;</code>
   * @return The topicName.
   */
  java.lang.String getTopicName();
  /**
   * <code>string topic_name = 3;</code>
   * @return The bytes for topicName.
   */
  com.google.protobuf.ByteString
      getTopicNameBytes();

  /**
   * <code>.connect.ControlMessage.EntityType sender_type = 4;</code>
   * @return The enum numeric value on the wire for senderType.
   */
  int getSenderTypeValue();
  /**
   * <code>.connect.ControlMessage.EntityType sender_type = 4;</code>
   * @return The senderType.
   */
  org.apache.hudi.connect.ControlMessage.EntityType getSenderType();

  /**
   * <code>uint32 sender_partition = 5;</code>
   * @return The senderPartition.
   */
  int getSenderPartition();

  /**
   * <code>.connect.ControlMessage.EntityType receiver_type = 6;</code>
   * @return The enum numeric value on the wire for receiverType.
   */
  int getReceiverTypeValue();
  /**
   * <code>.connect.ControlMessage.EntityType receiver_type = 6;</code>
   * @return The receiverType.
   */
  org.apache.hudi.connect.ControlMessage.EntityType getReceiverType();

  /**
   * <code>uint32 receiver_partition = 7;</code>
   * @return The receiverPartition.
   */
  int getReceiverPartition();

  /**
   * <code>string commitTime = 8;</code>
   * @return The commitTime.
   */
  java.lang.String getCommitTime();
  /**
   * <code>string commitTime = 8;</code>
   * @return The bytes for commitTime.
   */
  com.google.protobuf.ByteString
      getCommitTimeBytes();

  /**
   * <code>.connect.ControlMessage.CoordinatorInfo coordinator_info = 9;</code>
   * @return Whether the coordinatorInfo field is set.
   */
  boolean hasCoordinatorInfo();
  /**
   * <code>.connect.ControlMessage.CoordinatorInfo coordinator_info = 9;</code>
   * @return The coordinatorInfo.
   */
  org.apache.hudi.connect.ControlMessage.CoordinatorInfo getCoordinatorInfo();
  /**
   * <code>.connect.ControlMessage.CoordinatorInfo coordinator_info = 9;</code>
   */
  org.apache.hudi.connect.ControlMessage.CoordinatorInfoOrBuilder getCoordinatorInfoOrBuilder();

  /**
   * <code>.connect.ControlMessage.ParticipantInfo participant_info = 10;</code>
   * @return Whether the participantInfo field is set.
   */
  boolean hasParticipantInfo();
  /**
   * <code>.connect.ControlMessage.ParticipantInfo participant_info = 10;</code>
   * @return The participantInfo.
   */
  org.apache.hudi.connect.ControlMessage.ParticipantInfo getParticipantInfo();
  /**
   * <code>.connect.ControlMessage.ParticipantInfo participant_info = 10;</code>
   */
  org.apache.hudi.connect.ControlMessage.ParticipantInfoOrBuilder getParticipantInfoOrBuilder();

  public org.apache.hudi.connect.ControlMessage.PayloadCase getPayloadCase();
}
