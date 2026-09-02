(ns simple-billy-api.specs.service-job-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def service-job-status-data
  {
   })

(def service-job-status-spec
  (ds/spec
    {:name ::service-job-status
     :spec service-job-status-data}))
