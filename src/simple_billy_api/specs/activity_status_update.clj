(ns simple-billy-api.specs.activity-status-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def activity-status-update-data
  {
   (ds/req :status) string?
   })

(def activity-status-update-spec
  (ds/spec
    {:name ::activity-status-update
     :spec activity-status-update-data}))
