(ns simple-billy-api.specs.team
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def team-data
  {
   (ds/req :created_at) inst?
   (ds/opt :description) string?
   (ds/req :id) uuid?
   (ds/req :name) string?
   (ds/opt :parent_team_id) uuid?
   (ds/req :tenant_id) uuid?
   (ds/req :updated_at) inst?
   })

(def team-spec
  (ds/spec
    {:name ::team
     :spec team-data}))
