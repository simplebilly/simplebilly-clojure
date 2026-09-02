(ns simple-billy-api.specs.packing-video-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def packing-video-response-data
  {
   (ds/req :message) string?
   (ds/opt :recording_url) string?
   (ds/req :success) boolean?
   })

(def packing-video-response-spec
  (ds/spec
    {:name ::packing-video-response
     :spec packing-video-response-data}))
