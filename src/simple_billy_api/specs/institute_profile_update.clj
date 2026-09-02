(ns simple-billy-api.specs.institute-profile-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def institute-profile-update-data
  {
   (ds/opt :instituteType) string?
   (ds/opt :kapitalmarktorientiert) boolean?
   })

(def institute-profile-update-spec
  (ds/spec
    {:name ::institute-profile-update
     :spec institute-profile-update-data}))
