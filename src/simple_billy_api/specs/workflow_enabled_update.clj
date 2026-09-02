(ns simple-billy-api.specs.workflow-enabled-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def workflow-enabled-update-data
  {
   (ds/req :enabled) boolean?
   })

(def workflow-enabled-update-spec
  (ds/spec
    {:name ::workflow-enabled-update
     :spec workflow-enabled-update-data}))
