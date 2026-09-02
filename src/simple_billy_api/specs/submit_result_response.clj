(ns simple-billy-api.specs.submit-result-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def submit-result-response-data
  {
   (ds/opt :certificateId) string?
   (ds/req :completionId) uuid?
   (ds/req :passScore) int?
   (ds/req :passed) boolean?
   (ds/req :score) int?
   (ds/opt :validUntil) inst?
   })

(def submit-result-response-spec
  (ds/spec
    {:name ::submit-result-response
     :spec submit-result-response-data}))
