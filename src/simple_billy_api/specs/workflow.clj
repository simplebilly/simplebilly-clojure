(ns simple-billy-api.specs.workflow
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def workflow-data
  {
   (ds/opt :actions) any-type-spec
   (ds/opt :enabled) boolean?
   (ds/req :name) string?
   (ds/req :triggerEvent) string?
   })

(def workflow-spec
  (ds/spec
    {:name ::workflow
     :spec workflow-data}))
