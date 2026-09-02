(ns simple-billy-api.specs.workflow-action
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def workflow-action-data
  {
   (ds/req :action_type) string?
   (ds/opt :body) string?
   (ds/opt :subject) string?
   })

(def workflow-action-spec
  (ds/spec
    {:name ::workflow-action
     :spec workflow-action-data}))
