/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class announce_entry {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected announce_entry(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(announce_entry obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_announce_entry(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUrl(String value) {
    libtorrent_jni.announce_entry_url_set(swigCPtr, this, value);
  }

  public String getUrl() {
    return libtorrent_jni.announce_entry_url_get(swigCPtr, this);
  }

  public void setTrackerid(String value) {
    libtorrent_jni.announce_entry_trackerid_set(swigCPtr, this, value);
  }

  public String getTrackerid() {
    return libtorrent_jni.announce_entry_trackerid_get(swigCPtr, this);
  }

  public void setEndpoints(announce_endpoint_vector value) {
    libtorrent_jni.announce_entry_endpoints_set(swigCPtr, this, announce_endpoint_vector.getCPtr(value), value);
  }

  public announce_endpoint_vector getEndpoints() {
    long cPtr = libtorrent_jni.announce_entry_endpoints_get(swigCPtr, this);
    return (cPtr == 0) ? null : new announce_endpoint_vector(cPtr, false);
  }

  public void setTier(short value) {
    libtorrent_jni.announce_entry_tier_set(swigCPtr, this, value);
  }

  public short getTier() {
    return libtorrent_jni.announce_entry_tier_get(swigCPtr, this);
  }

  public void setFail_limit(short value) {
    libtorrent_jni.announce_entry_fail_limit_set(swigCPtr, this, value);
  }

  public short getFail_limit() {
    return libtorrent_jni.announce_entry_fail_limit_get(swigCPtr, this);
  }

  public void setSource(short value) {
    libtorrent_jni.announce_entry_source_set(swigCPtr, this, value);
  }

  public short getSource() {
    return libtorrent_jni.announce_entry_source_get(swigCPtr, this);
  }

  public void setVerified(boolean value) {
    libtorrent_jni.announce_entry_verified_set(swigCPtr, this, value);
  }

  public boolean getVerified() {
    return libtorrent_jni.announce_entry_verified_get(swigCPtr, this);
  }

  public void trim() {
    libtorrent_jni.announce_entry_trim(swigCPtr, this);
  }

  public announce_entry(String u) {
    this(libtorrent_jni.new_announce_entry(u), true);
  }

  public final static class tracker_source {
    public final static announce_entry.tracker_source source_torrent = new announce_entry.tracker_source("source_torrent", libtorrent_jni.announce_entry_source_torrent_get());
    public final static announce_entry.tracker_source source_client = new announce_entry.tracker_source("source_client", libtorrent_jni.announce_entry_source_client_get());
    public final static announce_entry.tracker_source source_magnet_link = new announce_entry.tracker_source("source_magnet_link", libtorrent_jni.announce_entry_source_magnet_link_get());
    public final static announce_entry.tracker_source source_tex = new announce_entry.tracker_source("source_tex", libtorrent_jni.announce_entry_source_tex_get());

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static tracker_source swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + tracker_source.class + " with value " + swigValue);
    }

    private tracker_source(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private tracker_source(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private tracker_source(String swigName, tracker_source swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static tracker_source[] swigValues = { source_torrent, source_client, source_magnet_link, source_tex };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
