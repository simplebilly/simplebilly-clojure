(ns simple-billy-api.specs.api-response-team-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def api-response-team-data-data
  {
   (ds/req :created_at) inst?
   (ds/opt :description) string?
   (ds/req :id) uuid?
   (ds/req :name) string?
   (ds/opt :parent_team_id) uuid?
   (ds/req :tenant_id) uuid?
   (ds/req :updated_at) inst?
   })

(def api-response-team-data-spec
  (ds/spec
    {:name ::api-response-team-data
     :spec api-response-team-data-data}))
