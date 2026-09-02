(ns simple-billy-api.specs.job-posting-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def job-posting-status-data
  {
   })

(def job-posting-status-spec
  (ds/spec
    {:name ::job-posting-status
     :spec job-posting-status-data}))
