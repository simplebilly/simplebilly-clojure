(ns simple-billy-api.specs.platform-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.changelog-entry :refer :all]
            [simple-billy-api.specs.config-field-info :refer :all]
            [simple-billy-api.specs.plugin-pricing :refer :all]
            )
  (:import (java.io File)))


(def platform-info-data
  {
   (ds/req :author) string?
   (ds/req :changelog) (s/coll-of changelog-entry-spec)
   (ds/req :config_field_names) (s/coll-of string?)
   (ds/req :config_fields) (s/coll-of config-field-info-spec)
   (ds/req :display_name) string?
   (ds/req :platform) string?
   (ds/req :pricing) plugin-pricing-spec
   (ds/req :supported_entities) (s/coll-of string?)
   (ds/req :supports_export) boolean?
   (ds/req :supports_import) boolean?
   (ds/req :supports_oauth) boolean?
   (ds/req :version) string?
   })

(def platform-info-spec
  (ds/spec
    {:name ::platform-info
     :spec platform-info-data}))
