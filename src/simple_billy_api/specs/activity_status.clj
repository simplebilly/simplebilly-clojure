(ns simple-billy-api.specs.activity-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def activity-status-data
  {
   })

(def activity-status-spec
  (ds/spec
    {:name ::activity-status
     :spec activity-status-data}))
