(ns simple-billy-api.specs.import-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def import-job-status-data
  {
   (ds/opt :error) string?
   (ds/req :job_id) string?
   (ds/req :processed) int?
   (ds/req :progress) int?
   (ds/opt :provider) string?
   (ds/req :stage) string?
   (ds/req :status) string?
   (ds/req :total) int?
   })

(def import-job-status-spec
  (ds/spec
    {:name ::import-job-status
     :spec import-job-status-data}))
