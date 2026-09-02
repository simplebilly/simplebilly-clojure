(ns simple-billy-api.specs.job
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.job-status :refer :all]
            )
  (:import (java.io File)))


(def job-data
  {
   (ds/opt :attempts) int?
   (ds/req :jobType) string?
   (ds/req :maxAttempts) int?
   (ds/opt :payload) any-type-spec
   (ds/opt :runAt) inst?
   (ds/req :status) job-status-spec
   })

(def job-spec
  (ds/spec
    {:name ::job
     :spec job-data}))
