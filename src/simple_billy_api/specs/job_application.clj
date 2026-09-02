(ns simple-billy-api.specs.job-application
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.application-status :refer :all]
            )
  (:import (java.io File)))


(def job-application-data
  {
   (ds/opt :cvFile) string?
   (ds/opt :cvText) string?
   (ds/opt :email) string?
   (ds/opt :matchReason) string?
   (ds/opt :matchScore) int?
   (ds/opt :name) string?
   (ds/opt :phone) string?
   (ds/opt :postingId) uuid?
   (ds/req :source) string?
   (ds/req :status) application-status-spec
   })

(def job-application-spec
  (ds/spec
    {:name ::job-application
     :spec job-application-data}))
