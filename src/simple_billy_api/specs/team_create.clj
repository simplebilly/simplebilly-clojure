(ns simple-billy-api.specs.team-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def team-create-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :parentTeamId) uuid?
   })

(def team-create-spec
  (ds/spec
    {:name ::team-create
     :spec team-create-data}))
