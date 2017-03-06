/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class add_torrent_params {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected add_torrent_params(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(add_torrent_params obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_add_torrent_params(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVersion(int value) {
    libtorrent_jni.add_torrent_params_version_set(swigCPtr, this, value);
  }

  public int getVersion() {
    return libtorrent_jni.add_torrent_params_version_get(swigCPtr, this);
  }

  public void setTrackers(string_vector value) {
    libtorrent_jni.add_torrent_params_trackers_set(swigCPtr, this, string_vector.getCPtr(value), value);
  }

  public string_vector getTrackers() {
    long cPtr = libtorrent_jni.add_torrent_params_trackers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_vector(cPtr, false);
  }

  public void setTracker_tiers(int_vector value) {
    libtorrent_jni.add_torrent_params_tracker_tiers_set(swigCPtr, this, int_vector.getCPtr(value), value);
  }

  public int_vector getTracker_tiers() {
    long cPtr = libtorrent_jni.add_torrent_params_tracker_tiers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new int_vector(cPtr, false);
  }

  public void setDht_nodes(string_int_pair_vector value) {
    libtorrent_jni.add_torrent_params_dht_nodes_set(swigCPtr, this, string_int_pair_vector.getCPtr(value), value);
  }

  public string_int_pair_vector getDht_nodes() {
    long cPtr = libtorrent_jni.add_torrent_params_dht_nodes_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_int_pair_vector(cPtr, false);
  }

  public void setName(String value) {
    libtorrent_jni.add_torrent_params_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return libtorrent_jni.add_torrent_params_name_get(swigCPtr, this);
  }

  public void setSave_path(String value) {
    libtorrent_jni.add_torrent_params_save_path_set(swigCPtr, this, value);
  }

  public String getSave_path() {
    return libtorrent_jni.add_torrent_params_save_path_get(swigCPtr, this);
  }

  public void setStorage_mode(storage_mode_t value) {
    libtorrent_jni.add_torrent_params_storage_mode_set(swigCPtr, this, value.swigValue());
  }

  public storage_mode_t getStorage_mode() {
    return storage_mode_t.swigToEnum(libtorrent_jni.add_torrent_params_storage_mode_get(swigCPtr, this));
  }

  public void setFile_priorities(byte_vector value) {
    libtorrent_jni.add_torrent_params_file_priorities_set(swigCPtr, this, byte_vector.getCPtr(value), value);
  }

  public byte_vector getFile_priorities() {
    long cPtr = libtorrent_jni.add_torrent_params_file_priorities_get(swigCPtr, this);
    return (cPtr == 0) ? null : new byte_vector(cPtr, false);
  }

  public void setTrackerid(String value) {
    libtorrent_jni.add_torrent_params_trackerid_set(swigCPtr, this, value);
  }

  public String getTrackerid() {
    return libtorrent_jni.add_torrent_params_trackerid_get(swigCPtr, this);
  }

  public void setUrl(String value) {
    libtorrent_jni.add_torrent_params_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.add_torrent_params_url_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    libtorrent_jni.add_torrent_params_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return libtorrent_jni.add_torrent_params_flags_get(swigCPtr, this);
  }

  public void setInfo_hash(sha1_hash value) {
    libtorrent_jni.add_torrent_params_info_hash_set(swigCPtr, this, sha1_hash.getCPtr(value), value);
  }

  public sha1_hash getInfo_hash() {
    long cPtr = libtorrent_jni.add_torrent_params_info_hash_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash(cPtr, false);
  }

  public void setMax_uploads(int value) {
    libtorrent_jni.add_torrent_params_max_uploads_set(swigCPtr, this, value);
  }

  public int getMax_uploads() {
    return libtorrent_jni.add_torrent_params_max_uploads_get(swigCPtr, this);
  }

  public void setMax_connections(int value) {
    libtorrent_jni.add_torrent_params_max_connections_set(swigCPtr, this, value);
  }

  public int getMax_connections() {
    return libtorrent_jni.add_torrent_params_max_connections_get(swigCPtr, this);
  }

  public void setUpload_limit(int value) {
    libtorrent_jni.add_torrent_params_upload_limit_set(swigCPtr, this, value);
  }

  public int getUpload_limit() {
    return libtorrent_jni.add_torrent_params_upload_limit_get(swigCPtr, this);
  }

  public void setDownload_limit(int value) {
    libtorrent_jni.add_torrent_params_download_limit_set(swigCPtr, this, value);
  }

  public int getDownload_limit() {
    return libtorrent_jni.add_torrent_params_download_limit_get(swigCPtr, this);
  }

  public void setTotal_uploaded(long value) {
    libtorrent_jni.add_torrent_params_total_uploaded_set(swigCPtr, this, value);
  }

  public long getTotal_uploaded() {
    return libtorrent_jni.add_torrent_params_total_uploaded_get(swigCPtr, this);
  }

  public void setTotal_downloaded(long value) {
    libtorrent_jni.add_torrent_params_total_downloaded_set(swigCPtr, this, value);
  }

  public long getTotal_downloaded() {
    return libtorrent_jni.add_torrent_params_total_downloaded_get(swigCPtr, this);
  }

  public void setActive_time(int value) {
    libtorrent_jni.add_torrent_params_active_time_set(swigCPtr, this, value);
  }

  public int getActive_time() {
    return libtorrent_jni.add_torrent_params_active_time_get(swigCPtr, this);
  }

  public void setFinished_time(int value) {
    libtorrent_jni.add_torrent_params_finished_time_set(swigCPtr, this, value);
  }

  public int getFinished_time() {
    return libtorrent_jni.add_torrent_params_finished_time_get(swigCPtr, this);
  }

  public void setSeeding_time(int value) {
    libtorrent_jni.add_torrent_params_seeding_time_set(swigCPtr, this, value);
  }

  public int getSeeding_time() {
    return libtorrent_jni.add_torrent_params_seeding_time_get(swigCPtr, this);
  }

  public void setAdded_time(long value) {
    libtorrent_jni.add_torrent_params_added_time_set(swigCPtr, this, value);
  }

  public long getAdded_time() {
    return libtorrent_jni.add_torrent_params_added_time_get(swigCPtr, this);
  }

  public void setCompleted_time(long value) {
    libtorrent_jni.add_torrent_params_completed_time_set(swigCPtr, this, value);
  }

  public long getCompleted_time() {
    return libtorrent_jni.add_torrent_params_completed_time_get(swigCPtr, this);
  }

  public void setLast_seen_complete(long value) {
    libtorrent_jni.add_torrent_params_last_seen_complete_set(swigCPtr, this, value);
  }

  public long getLast_seen_complete() {
    return libtorrent_jni.add_torrent_params_last_seen_complete_get(swigCPtr, this);
  }

  public void setNum_complete(int value) {
    libtorrent_jni.add_torrent_params_num_complete_set(swigCPtr, this, value);
  }

  public int getNum_complete() {
    return libtorrent_jni.add_torrent_params_num_complete_get(swigCPtr, this);
  }

  public void setNum_incomplete(int value) {
    libtorrent_jni.add_torrent_params_num_incomplete_set(swigCPtr, this, value);
  }

  public int getNum_incomplete() {
    return libtorrent_jni.add_torrent_params_num_incomplete_get(swigCPtr, this);
  }

  public void setNum_downloaded(int value) {
    libtorrent_jni.add_torrent_params_num_downloaded_set(swigCPtr, this, value);
  }

  public int getNum_downloaded() {
    return libtorrent_jni.add_torrent_params_num_downloaded_get(swigCPtr, this);
  }

  public void setHttp_seeds(string_vector value) {
    libtorrent_jni.add_torrent_params_http_seeds_set(swigCPtr, this, string_vector.getCPtr(value), value);
  }

  public string_vector getHttp_seeds() {
    long cPtr = libtorrent_jni.add_torrent_params_http_seeds_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_vector(cPtr, false);
  }

  public void setUrl_seeds(string_vector value) {
    libtorrent_jni.add_torrent_params_url_seeds_set(swigCPtr, this, string_vector.getCPtr(value), value);
  }

  public string_vector getUrl_seeds() {
    long cPtr = libtorrent_jni.add_torrent_params_url_seeds_get(swigCPtr, this);
    return (cPtr == 0) ? null : new string_vector(cPtr, false);
  }

  public void setPeers(tcp_endpoint_vector value) {
    libtorrent_jni.add_torrent_params_peers_set(swigCPtr, this, tcp_endpoint_vector.getCPtr(value), value);
  }

  public tcp_endpoint_vector getPeers() {
    long cPtr = libtorrent_jni.add_torrent_params_peers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint_vector(cPtr, false);
  }

  public void setBanned_peers(tcp_endpoint_vector value) {
    libtorrent_jni.add_torrent_params_banned_peers_set(swigCPtr, this, tcp_endpoint_vector.getCPtr(value), value);
  }

  public tcp_endpoint_vector getBanned_peers() {
    long cPtr = libtorrent_jni.add_torrent_params_banned_peers_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint_vector(cPtr, false);
  }

  public void setHave_pieces(piece_index_bitfield value) {
    libtorrent_jni.add_torrent_params_have_pieces_set(swigCPtr, this, piece_index_bitfield.getCPtr(value), value);
  }

  public piece_index_bitfield getHave_pieces() {
    long cPtr = libtorrent_jni.add_torrent_params_have_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public void setVerified_pieces(piece_index_bitfield value) {
    libtorrent_jni.add_torrent_params_verified_pieces_set(swigCPtr, this, piece_index_bitfield.getCPtr(value), value);
  }

  public piece_index_bitfield getVerified_pieces() {
    long cPtr = libtorrent_jni.add_torrent_params_verified_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new piece_index_bitfield(cPtr, false);
  }

  public void setPiece_priorities(byte_vector value) {
    libtorrent_jni.add_torrent_params_piece_priorities_set(swigCPtr, this, byte_vector.getCPtr(value), value);
  }

  public byte_vector getPiece_priorities() {
    long cPtr = libtorrent_jni.add_torrent_params_piece_priorities_get(swigCPtr, this);
    return (cPtr == 0) ? null : new byte_vector(cPtr, false);
  }

  public void setMerkle_tree(sha1_hash_vector value) {
    libtorrent_jni.add_torrent_params_merkle_tree_set(swigCPtr, this, sha1_hash_vector.getCPtr(value), value);
  }

  public sha1_hash_vector getMerkle_tree() {
    long cPtr = libtorrent_jni.add_torrent_params_merkle_tree_get(swigCPtr, this);
    return (cPtr == 0) ? null : new sha1_hash_vector(cPtr, false);
  }

  public void setRenamed_files(file_index_string_map value) {
    libtorrent_jni.add_torrent_params_renamed_files_set(swigCPtr, this, file_index_string_map.getCPtr(value), value);
  }

  public file_index_string_map getRenamed_files() {
    long cPtr = libtorrent_jni.add_torrent_params_renamed_files_get(swigCPtr, this);
    return (cPtr == 0) ? null : new file_index_string_map(cPtr, false);
  }

  public torrent_info ti_ptr() {
    long cPtr = libtorrent_jni.add_torrent_params_ti_ptr(swigCPtr, this);
    return (cPtr == 0) ? null : new torrent_info(cPtr, false);
  }

  public void set_ti(torrent_info ti) {
    libtorrent_jni.add_torrent_params_set_ti(swigCPtr, this, torrent_info.getCPtr(ti), ti);
  }

  public static add_torrent_params create_instance() {
    return new add_torrent_params(libtorrent_jni.add_torrent_params_create_instance(), true);
  }

  public static add_torrent_params create_instance_disabled_storage() {
    return new add_torrent_params(libtorrent_jni.add_torrent_params_create_instance_disabled_storage(), true);
  }

  public static add_torrent_params create_instance_zero_storage() {
    return new add_torrent_params(libtorrent_jni.add_torrent_params_create_instance_zero_storage(), true);
  }

  public static add_torrent_params read_resume_data(bdecode_node rd, error_code ec) {
    return new add_torrent_params(libtorrent_jni.add_torrent_params_read_resume_data__SWIG_0(bdecode_node.getCPtr(rd), rd, error_code.getCPtr(ec), ec), true);
  }

  public static add_torrent_params read_resume_data(byte_vector buffer, error_code ec) {
    return new add_torrent_params(libtorrent_jni.add_torrent_params_read_resume_data__SWIG_1(byte_vector.getCPtr(buffer), buffer, error_code.getCPtr(ec), ec), true);
  }

  public static entry write_resume_data(add_torrent_params atp) {
    return new entry(libtorrent_jni.add_torrent_params_write_resume_data(add_torrent_params.getCPtr(atp), atp), true);
  }

  public static byte_vector write_resume_data_buf(add_torrent_params atp) {
    return new byte_vector(libtorrent_jni.add_torrent_params_write_resume_data_buf(add_torrent_params.getCPtr(atp), atp), true);
  }

  public final static class flags_t {
    public final static add_torrent_params.flags_t flag_seed_mode = new add_torrent_params.flags_t("flag_seed_mode", libtorrent_jni.add_torrent_params_flag_seed_mode_get());
    public final static add_torrent_params.flags_t flag_upload_mode = new add_torrent_params.flags_t("flag_upload_mode", libtorrent_jni.add_torrent_params_flag_upload_mode_get());
    public final static add_torrent_params.flags_t flag_share_mode = new add_torrent_params.flags_t("flag_share_mode", libtorrent_jni.add_torrent_params_flag_share_mode_get());
    public final static add_torrent_params.flags_t flag_apply_ip_filter = new add_torrent_params.flags_t("flag_apply_ip_filter", libtorrent_jni.add_torrent_params_flag_apply_ip_filter_get());
    public final static add_torrent_params.flags_t flag_paused = new add_torrent_params.flags_t("flag_paused", libtorrent_jni.add_torrent_params_flag_paused_get());
    public final static add_torrent_params.flags_t flag_auto_managed = new add_torrent_params.flags_t("flag_auto_managed", libtorrent_jni.add_torrent_params_flag_auto_managed_get());
    public final static add_torrent_params.flags_t flag_duplicate_is_error = new add_torrent_params.flags_t("flag_duplicate_is_error", libtorrent_jni.add_torrent_params_flag_duplicate_is_error_get());
    public final static add_torrent_params.flags_t flag_update_subscribe = new add_torrent_params.flags_t("flag_update_subscribe", libtorrent_jni.add_torrent_params_flag_update_subscribe_get());
    public final static add_torrent_params.flags_t flag_super_seeding = new add_torrent_params.flags_t("flag_super_seeding", libtorrent_jni.add_torrent_params_flag_super_seeding_get());
    public final static add_torrent_params.flags_t flag_sequential_download = new add_torrent_params.flags_t("flag_sequential_download", libtorrent_jni.add_torrent_params_flag_sequential_download_get());
    public final static add_torrent_params.flags_t flag_stop_when_ready = new add_torrent_params.flags_t("flag_stop_when_ready", libtorrent_jni.add_torrent_params_flag_stop_when_ready_get());
    public final static add_torrent_params.flags_t flag_override_trackers = new add_torrent_params.flags_t("flag_override_trackers", libtorrent_jni.add_torrent_params_flag_override_trackers_get());
    public final static add_torrent_params.flags_t flag_override_web_seeds = new add_torrent_params.flags_t("flag_override_web_seeds", libtorrent_jni.add_torrent_params_flag_override_web_seeds_get());
    public final static add_torrent_params.flags_t flag_need_save_resume = new add_torrent_params.flags_t("flag_need_save_resume", libtorrent_jni.add_torrent_params_flag_need_save_resume_get());
    public final static add_torrent_params.flags_t default_flags = new add_torrent_params.flags_t("default_flags", libtorrent_jni.add_torrent_params_default_flags_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static flags_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + flags_t.class + " with value " + swigValue);
    }

    private flags_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private flags_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private flags_t(String swigName, flags_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static flags_t[] swigValues = { flag_seed_mode, flag_upload_mode, flag_share_mode, flag_apply_ip_filter, flag_paused, flag_auto_managed, flag_duplicate_is_error, flag_update_subscribe, flag_super_seeding, flag_sequential_download, flag_stop_when_ready, flag_override_trackers, flag_override_web_seeds, flag_need_save_resume, default_flags };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
