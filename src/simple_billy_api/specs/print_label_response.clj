(ns simple-billy-api.specs.print-label-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def print-label-response-data
  {
   (ds/opt :label_url) string?
   (ds/req :message) string?
   (ds/opt :sscc) string?
   (ds/req :success) boolean?
   (ds/opt :tracking_number) string?
   })

(def print-label-response-spec
  (ds/spec
    {:name ::print-label-response
     :spec print-label-response-data}))
